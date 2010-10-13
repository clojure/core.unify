;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "A unification library for Clojure."
      :author "Michael Fogus"}
  clojure.core.unify
  (:require [clojure [zip :as zip]])
  (:use [clojure.contrib.core :only [seqable?]]
        [clojure.walk :as walk :only [prewalk]]))

(def *variablep* #(and (symbol? %) (re-matches #"^\?.*" (name %))))

(declare garner-unifiers)

(defn- occurs?
  "Does v occur anywhere inside expr?"
  [variable? v expr binds]
  (loop [z (zip/zipper seqable? seq #(do % %2) [expr])]
    (let [current (zip/node z)]
      (cond 
        (zip/end? z) false
        (= v current) true
        (and (variable? current)
             (find binds current))
        (recur (zip/next (zip/insert-right z (binds current))))
        (zip/end? z) false
        :else (recur (zip/next z))))))

(defn- unify-variable
  "Unify the variable v with expr.  Uses the bindings supplied and possibly returns an extended bindings map."
  [variable? v expr binds]
  (if-let [vb (binds v)] 
    (garner-unifiers variable? vb expr binds)
    (if-let [vexpr (and (variable? expr) (binds expr))]
      (garner-unifiers variable? v vexpr binds)
      (if (occurs? variable? v expr binds)
        (throw (IllegalStateException. (str "Cycle found in the path " expr)))
        (assoc binds v expr)))))

(defn- unify-variable-
  "Unify the variable v with expr.  Uses the bindings supplied and possibly returns an extended bindings map."
  [variable? v expr binds]
  (if-let [vb (binds v)] 
    (garner-unifiers variable? vb expr binds)
    (if-let [vexpr (and (variable? expr) (binds expr))]
      (garner-unifiers variable? v vexpr binds)
      (assoc binds v expr))))

(defn- garner-unifiers
  "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the 
   unifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions
   contain a cyclycle relationship.  Will also throw an `IllegalArgumentException` if the
   sub-expressions clash."
  ([x y]           (garner-unifiers *variablep* x y))
  ([variable? x y] (garner-unifiers variable? x y {}))
  ([variable? x y binds]
     (cond
       (not binds)               (throw (IllegalStateException. (str "Cycle found in the path " x)))
       (= x y)                   binds
       (variable? x)             (unify-variable variable? x y binds)
       (variable? y)             (unify-variable variable? y x binds)
       (every? seqable? [x y])   (garner-unifiers variable?
                                                  (rest x) 
                                                  (rest y)
                                                  (garner-unifiers variable?
                                                                   (first x)
                                                                   (first y) 
                                                                   binds))
       :else (throw (IllegalArgumentException. (str "Clash found in " x))))))

(defn- subst-bindings
  "Flattens recursive bindings in the given map."
  ([binds] (subst-bindings *variablep* binds))
  ([variable? binds]
     (into {} (map (fn [[k v]]
                     [k (loop [v v]
                          (if (variable? v)
                            (recur (binds v))
                            v))])
                   binds))))

(defn- try-subst
  "Attempts to substitute the bindings in the appropriate locations in the given expression."
  [variable? x binds]
  (walk/prewalk (fn [expr] 
                  (if (variable? expr)
                    (or (binds expr) expr) 
                    expr)) 
                x))

(defn- unifier*
  "Attempts the entire unification process from garnering the bindings to substituting
   the appropriate bindings."
  ([x y] (unifier* *variablep* x y))
  ([variable? x y]
     (unifier* variable? x y (garner-unifiers variable? x y)))
  ([variable? x y binds]
     (->> binds
          (subst-bindings variable?)
          (try-subst variable? y))))   ;; y is arbitrary

;; OCCURS

(defn make-occurs-unify-fn
  "Given a function to recognize unification variables, returns a function to
   return a bindings map for two expressions.  This function uses an 'occurs check'
   methodology for detecting cycles."
  [variable-fn]
  (partial garner-unifiers variable-fn))

(defn make-occurs-subst-fn
  "Given a function to recognize unification variables, returns a function that
   will attempt to substitute unification bindings between two expressions.
   This function uses an 'occurs check' methodology for detecting cycles."
  [variable-fn]
  (partial try-subst variable-fn))

(defn make-occurs-unifier-fn
  "Given a function to recognize unification variables, returns a function to
   perform the unification of two expressions. This function uses an 'occurs check'
   methodology for detecting cycles."
  [variable-fn]
  (partial unifier* variable-fn))

(def ^{:doc (:doc (meta #'garner-unifiers))} unify   (make-occurs-unify-fn *variablep*))
(def ^{:doc (:doc (meta #'try-subst))}       subst   (make-occurs-subst-fn *variablep*))
(def ^{:doc (:doc (meta #'unifier))}         unifier (make-occurs-unifier-fn *variablep*))

;; NO OCCURS

(defn make-unify-fn
  "Given a function to recognize unification variables, returns a function to
   return a bindings map for two expressions."
  [variable-fn]
  (binding [unify-variable unify-variable-] 
    (partial (bound-fn [& args] (apply garner-unifiers args)) variable-fn)))

(defn make-subst-fn
  "Given a function to recognize unification variables, returns a function that
   will attempt to substitute unification bindings between two expressions."
  [variable-fn]
  (binding [unify-variable unify-variable-]
    (partial (bound-fn [& args] (apply try-subst args)) variable-fn)))

(defn make-unifier-fn
  "Given a function to recognize unification variables, returns a function to
   perform the unification of two expressions."
  [variable-fn]
  (binding [unify-variable unify-variable-]
    (partial (bound-fn [& args] (apply unifier* args)) variable-fn)))

(def ^{:doc (:doc (meta #'garner-unifiers))} unify-   (make-unify-fn *variablep*))
(def ^{:doc (:doc (meta #'try-subst))}       subst-   (make-subst-fn *variablep*))
(def ^{:doc (:doc (meta #'unifier))}         unifier- (make-unifier-fn *variablep*))
