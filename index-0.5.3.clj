{:namespaces
 ({:source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
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
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L159",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.\nThis function uses an 'occurs check' methodology for detecting cycles.",
   :var-type "function",
   :line 159,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L166",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions. This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 166,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L152",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.  This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 152,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-subst-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L196",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.",
   :var-type "function",
   :line 196,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L202",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions.",
   :var-type "function",
   :line 202,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L190",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.",
   :var-type "function",
   :line 190,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression bindings]),
   :name "subst",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L179",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/subst",
   :doc
   "Attempts to substitute the bindings in the appropriate locations in the given expression.",
   :var-type "function",
   :line 179,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L183",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 183,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L219",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier-",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 219,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L174",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 174,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj#L213",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/2e6534929a5faf6c3093f01536c622d574d6c1f2/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify-",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 213,
   :file "src/main/clojure/clojure/core/unify.clj"})}
