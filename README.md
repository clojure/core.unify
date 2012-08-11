clojure.core.unify
========================================

core.unify is a Clojure contrib library providing the following features:

* Factory functions for constructing unification binding, subst, and unification functions, with or without occurs checking

* Packaged functions for unification binding, subst, and unification functions, with or without occurs checking, recognizing variables tagged as symbols prefixed with `?` characters

core.unify is based on a library named Unifycle, found at http://github.com/fogus/unifycle that has been deprecated.

*[more information](http://fogus.me/fun/unifycle)*



Releases and Dependency Information
========================================

Latest stable release: 0.5.3

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22core.unify%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~core.unify~~~)

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

    [org.clojure/core.unify "0.5.3"]

[Maven](http://maven.apache.org/) dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>core.unify</artifactId>
      <version>0.5.3</version>
    </dependency>



Example Usage
========================================

```clojure
    (use 'clojure.core.unify)

    (unifier '((?a * ?x ** 2) + (?b * ?x) + ?c) 
         '(?z + (4 * 5) + 3))

    ;=> ((?a * 5 ** 2) + (4 * 5) + 3)	
```

Refer to docstrings in the `clojure.core.unify` namespace.



Developer Information
========================================

* [GitHub project](https://github.com/clojure/core.unify)

* [Bug Tracker](http://dev.clojure.org/jira/browse/UNIFY)

* [Continuous Integration](http://build.clojure.org/job/core.unify/)

* [Compatibility Test Matrix](http://build.clojure.org/job/core.unify-test-matrix/)



Change Log
====================

* Release 0.5.3 on 2012.05.25
  * Added `variable?` function
  * Unification of seqs of differing lengths fails (as expected)
* Release 0.5.2 on 2012.01.08
  * Removed reflection warnings
* Release 0.5.1 on 2011.10.11
  * Rolled in basis of Unifycle


Copyright and License
========================================

Copyright (c) Rich Hickey and Michael Fogus, 2012. All rights reserved.  The use and distribution terms for this software are covered by the Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can be found in the file epl-v10.html at the root of this distribution. By using this software in any fashion, you are agreeing to be bound bythe terms of this license.  You must not remove this notice, or any other, from this software.
