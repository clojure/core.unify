{:namespaces
 ({:source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
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
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L161",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.\nThis function uses an 'occurs check' methodology for detecting cycles.",
   :var-type "function",
   :line 161,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L168",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions. This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 168,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L154",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.  This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 154,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-subst-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L198",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.",
   :var-type "function",
   :line 198,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L204",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions.",
   :var-type "function",
   :line 204,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L192",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.",
   :var-type "function",
   :line 192,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression bindings]),
   :name "subst",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L181",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/subst",
   :doc
   "Attempts to substitute the bindings in the appropriate locations in the given expression.",
   :var-type "function",
   :line 181,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L185",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 185,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L221",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier-",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 221,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L176",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 176,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj#L215",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/bf6fa09a264d12624bd38bdc67c6265c76992782/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify-",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 215,
   :file "src/main/clojure/clojure/core/unify.clj"})}
