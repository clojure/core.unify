{:namespaces
 ({:source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify/clojure.core.unify-api.html",
   :name "clojure.core.unify",
   :author "Michael Fogus",
   :doc "A unification library for Clojure."}),
 :vars
 ({:arglists ([variable-fn]),
   :name "make-occurs-subst-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L155",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.\nThis function uses an 'occurs check' methodology for detecting cycles.",
   :var-type "function",
   :line 155,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L162",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions. This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 162,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L148",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.  This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 148,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-subst-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L192",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.",
   :var-type "function",
   :line 192,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L198",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions.",
   :var-type "function",
   :line 198,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L186",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.",
   :var-type "function",
   :line 186,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression bindings]),
   :name "subst",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L175",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/subst",
   :doc
   "Attempts to substitute the bindings in the appropriate locations in the given expression.",
   :var-type "function",
   :line 175,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L179",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 179,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L215",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier-",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 215,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L170",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 170,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj#L209",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2869b3a2ef1041a8170c1a4e0f08f4f09630a185/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify-",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 209,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/core.unify/src/src/main/clojure/clojure/core/unify.clj"})}
