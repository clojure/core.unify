{:namespaces
 ({:doc "A unification library for Clojure.",
   :author "Michael Fogus",
   :name "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify/clojure.core.unify-api.html",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "extract-lvars",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L22",
   :line 22,
   :var-type "function",
   :arglists ([form] [lv-fn form]),
   :doc
   "Takes a datastructure and returns a distinct set of the logical\nvariables found within.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/extract-lvars"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "flatten-bindings",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L131",
   :line 131,
   :var-type "function",
   :arglists ([binds] [variable? binds]),
   :doc
   "Flattens recursive bindings in the given map to the same ground (if possible).",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/flatten-bindings"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "make-occurs-subst-fn",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L178",
   :line 178,
   :var-type "function",
   :arglists ([variable-fn]),
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.\nThis function uses an 'occurs check' methodology for detecting cycles.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-subst-fn"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "make-occurs-unifier-fn",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L185",
   :line 185,
   :var-type "function",
   :arglists ([variable-fn]),
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions. This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unifier-fn"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "make-occurs-unify-fn",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L169",
   :line 169,
   :var-type "function",
   :arglists ([variable-fn]),
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.  This function uses an 'occurs check'\nmethodology for detecting cycles.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-occurs-unify-fn"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "make-subst-fn",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L217",
   :line 217,
   :var-type "function",
   :arglists ([variable-fn]),
   :doc
   "Given a function to recognize unification variables, returns a function that\nwill attempt to substitute unification bindings between two expressions.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-subst-fn"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "make-unifier-fn",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L223",
   :line 223,
   :var-type "function",
   :arglists ([variable-fn]),
   :doc
   "Given a function to recognize unification variables, returns a function to\nperform the unification of two expressions.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unifier-fn"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "make-unify-fn",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L209",
   :line 209,
   :var-type "function",
   :arglists ([variable-fn]),
   :doc
   "Given a function to recognize unification variables, returns a function to\nreturn a bindings map for two expressions.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/make-unify-fn"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "subst",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L198",
   :line 198,
   :var-type "function",
   :arglists ([expression bindings]),
   :doc
   "Attempts to substitute the bindings in the appropriate locations in the given expression.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/subst"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "unifier",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L202",
   :line 202,
   :var-type "function",
   :arglists ([expression1 expression2]),
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented with an occurs-check.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "unifier-",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L240",
   :line 240,
   :var-type "function",
   :arglists ([expression1 expression2]),
   :doc
   "Attempts the entire unification process from garnering the bindings to substituting\nthe appropriate bindings.  Note: This function is implemented **without** an occurs-check.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unifier-"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "unify",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L193",
   :line 193,
   :var-type "function",
   :arglists ([expression1 expression2]),
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented with an occurs-check.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify"}
  {:raw-source-url
   "https://github.com/clojure/core.unify/raw/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj",
   :name "unify-",
   :file "src/main/clojure/clojure/core/unify.clj",
   :source-url
   "https://github.com/clojure/core.unify/blob/264e3fb7f533b038a81facd90b30557ecbcf3aca/src/main/clojure/clojure/core/unify.clj#L234",
   :line 234,
   :var-type "function",
   :arglists ([expression1 expression2]),
   :doc
   "Attempt to unify x and y with the given bindings (if any). Potentially returns a map of the \nunifiers (bindings) found.  Will throw an `IllegalStateException` if the expressions\ncontain a cycle relationship.  Will also throw an `IllegalArgumentException` if the\nsub-expressions clash.  Note: This function is implemented **without** an occurs-check.",
   :namespace "clojure.core.unify",
   :wiki-url
   "http://clojure.github.com/core.unify//clojure.core.unify-api.html#clojure.core.unify/unify-"})}
