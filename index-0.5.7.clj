{:namespaces
 ({:source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify/clojure.core.unify-api.html",
   :name "clojure.core.unify",
   :author "Michael Fogus",
   :doc "A unification library for Clojure."}),
 :vars
 ({:arglists ([form] [lv-fn form]),
   :name "extract-lvars",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L22",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/extract-lvars",
   :doc
   "Takes a datastructure and returns a distinct set of the logical\nvariables found within.",
   :var-type "function",
   :line 22,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([binds] [variable? binds]),
   :name "flatten-bindings",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L131",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/flatten-bindings",
   :doc
   "Flattens recursive bindings in the given map to the same ground (if possible).",
   :var-type "function",
   :line 131,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-subst-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L178",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.\nThis function uses an 'occurs check' methodology for detecting cycles.",
   :var-type "function",
   :line 178,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L185",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions. This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 185,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-occurs-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L169",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.  This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :var-type "function",
   :line 169,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-subst-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L217",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-subst-fn",
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.",
   :var-type "function",
   :line 217,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unifier-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L223",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unifier-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions.",
   :var-type "function",
   :line 223,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([variable-fn]),
   :name "make-unify-fn",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L209",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unify-fn",
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.",
   :var-type "function",
   :line 209,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression bindings]),
   :name "subst",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L198",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/subst",
   :doc
   "Attempts to substitute the bindings in the appropriate locations in the given expression.",
   :var-type "function",
   :line 198,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L202",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 202,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unifier-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L240",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier-",
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 240,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L193",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented with an occurs-check.",
   :var-type "function",
   :line 193,
   :file "src/main/clojure/clojure/core/unify.clj"}
  {:arglists ([expression1 expression2]),
   :name "unify-",
   :namespace "clojure.core.unify",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L234",
   :raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify-",
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented **without** an occurs-check.",
   :var-type "function",
   :line 234,
   :file "src/main/clojure/clojure/core/unify.clj"})}
