(ns ^{:doc "A unification library for Clojure."
      :author "Michael Fogus"}
  clojure.core.unify.core
  (:use [clojure.core.unify.core] :reload-all)
  (:use [clojure.test]))

(deftest test-unify
  (is (= 1 1)))
