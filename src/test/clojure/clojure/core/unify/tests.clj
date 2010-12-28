;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "A unification library for Clojure."
      :author "Michael Fogus"}
  clojure.core.unify.tests
  (:use [clojure.core.unify] :reload-all)
  (:use [clojure.test]))

(def *caps* #(and (symbol? %) (Character/isUpperCase (first (name %)))))

(deftest test-garner-unifiers
  (is (= {}                                (#'clojure.core.unify/garner-unifiers '(a b)            '(a b))))
  (is (= {}                                (#'clojure.core.unify/garner-unifiers '(?a ?b)          '(?a ?b))))
  (is (thrown? IllegalArgumentException    (#'clojure.core.unify/garner-unifiers '(?a ?a)          'a)))
  (is (= '{?x 1}                           (#'clojure.core.unify/garner-unifiers '(f ?x ?y)        '(f 1 ?y))))
  (is (= '{?b 2, ?a 1}                     (#'clojure.core.unify/garner-unifiers '(?a ?b)          '(1 2))))
  (is (= '{?a (q)}                         (#'clojure.core.unify/garner-unifiers '(?a ?b)          '((q) ?b))))
  (is (= '{?x y}                           (#'clojure.core.unify/garner-unifiers '?x               'y)))
  (is (= '{?x ?y}                          (#'clojure.core.unify/garner-unifiers '(?x ?x)          '(?y ?y))))
  (is (= '{?x ?y}                          (#'clojure.core.unify/garner-unifiers '(?x ?x ?x)       '(?y ?y ?y))))
  (is (= '{?x ?y}                          (#'clojure.core.unify/garner-unifiers '(?x ?y)          '(?y ?x))))
  (is (thrown? IllegalArgumentException    (#'clojure.core.unify/garner-unifiers '(f ?x ?y)        '(g ?x ?y))))     ; clash
  (is (thrown? IllegalArgumentException    (#'clojure.core.unify/garner-unifiers '(?a ?a)          '(1 2))))         ; clash
  (is (thrown? IllegalArgumentException    (#'clojure.core.unify/garner-unifiers '(f ?a)           '(g 42))))        ; clash
  (is (thrown? IllegalArgumentException    (#'clojure.core.unify/garner-unifiers '(?a ?a)          'a)))             ; clash
  (is (= '{?y (h), ?x (h)}                 (#'clojure.core.unify/garner-unifiers '(f ?x (h))       '(f (h) ?y))))
  (is (thrown? IllegalStateException       (#'clojure.core.unify/garner-unifiers '(f (g ?x) ?y)    '(f ?y ?x))))     ; cycle
  (is (thrown? IllegalStateException       (#'clojure.core.unify/garner-unifiers '?x               '(f ?x))))        ; cycle
  (is (= '{?y (g ?x)}                      (#'clojure.core.unify/garner-unifiers '(f (g ?x) ?y)    '(f ?y (g ?x)))))
  (is (= '{?z (g ?x), ?y (g ?x)}           (#'clojure.core.unify/garner-unifiers '(f (g ?x) ?y)    '(f ?y ?z))))
  (is (= '{?a a}                           (#'clojure.core.unify/garner-unifiers '?a               'a)))
  (is (= '{?y :bar, ?x :foo}               (#'clojure.core.unify/garner-unifiers '{?x 42 ?y 108}   '{:foo 42 :bar 108})))
  (is (= '{B 2, A 1}                       (#'clojure.core.unify/garner-unifiers *caps* '(A B)     '(1 2))))
  (is (= '{Bar 2, Foo 1}                   (#'clojure.core.unify/garner-unifiers *caps* '(Foo Bar) '(1 2))))
  (is (= '{?y a, ?x ?y}                    (#'clojure.core.unify/garner-unifiers '(?x ?y a) '(?y ?x ?x)))))


(deftest test-subst-bindings
  (is (= '{?y a, ?x a}                     (#'clojure.core.unify/subst-bindings '{?y a, ?x ?y}))))


(deftest test-unifier*
  (is (= '(a a a)                          (#'clojure.core.unify/unifier* *caps* '(X Y a) '(Y X X) '{Y a, X a})))
  (is (= '(a a a)                          (#'clojure.core.unify/unifier* *caps* '(X Y a) '(Y X X))))
  (is (= '((?a * 5 ** 2) + (4 * 5) + 3)    (#'clojure.core.unify/unifier* '((?a * ?x ** 2) + (?b * ?x) + ?c) '(?z + (4 * 5) + 3)))))


(deftest test-unifier
  (is (= '((?a * 5 ** 2) + (4 * 5) + 3)    (#'clojure.core.unify/unifier '((?a * ?x ** 2) + (?b * ?x) + ?c) '(?z + (4 * 5) + 3))))
  (is (= 42                                (#'clojure.core.unify/unifier '?x 42)))
  (is (= '{a 2}                            (#'clojure.core.unify/unifier (hash-map 'a '?x) (hash-map 'a 2))))
  (is (= #{2 3 4}                          (#'clojure.core.unify/unifier #{'?a '?b '?c} #{2 3 4}))))


(deftest test-unifier-no-occurs
  (is (= '((?a * 5 ** 2) + (4 * 5) + 3)    (#'clojure.core.unify/unifier- '((?a * ?x ** 2) + (?b * ?x) + ?c) '(?z + (4 * 5) + 3))))
  (is (= 42                                (#'clojure.core.unify/unifier- '?x 42)))
  (is (= '{a 2}                            (#'clojure.core.unify/unifier- (hash-map 'a '?x) (hash-map 'a 2))))
  (is (= #{2 3 4}                          (#'clojure.core.unify/unifier- #{'?a '?b '?c} #{2 3 4}))))


(deftest test-mk-unifier
  (let [u (#'clojure.core.unify/make-occurs-unifier-fn #(and (symbol? %) 
                                                             (re-matches #"^\?.*" (name %))))]
    (is (= '((?a * 5 ** 2) + (4 * 5) + 3)  (u '((?a * ?x ** 2) + (?b * ?x) + ?c) '(?z + (4 * 5) + 3))))))

(deftest test-aux
  (is (#'clojure.core.unify/composite? "foo")))
