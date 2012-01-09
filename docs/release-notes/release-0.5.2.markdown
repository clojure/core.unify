core.unify v0.5.2 Release Notes
===============================

core.unify is a Clojure contrib library providing the following features:

* Factory functions for constructing unification binding, subst, and unification functions, with or without occurs checking

* Packaged functions for unification binding, subst, and unification functions, with or without occurs checking, recognizing variables tagged as symbols prefixed with `?` characters

core.unify is based on a library named Unifycle, found at http://github.com/fogus/unifycle that has been deprecated.


Absorb
------

You can use core.unify in your [Leiningen](https://github.com/technomancy/leiningen) and [Cake](https://github.com/flatland/cake) projects with the following `:dependencies` directive in your `project.clj` file:

    [org.clojure/core.unify "0.5.2"]

For Maven-driven projects, use the following slice of XML in your `pom.xml`'s `<dependencies>` section:

    <dependency>
	  <groupId>org.clojure</groupId>
	  <artifactId>core.unify</artifactId>
	  <version>0.5.2</version>
	</dependency>

Enjoy!

Places
------

* [Source code](https://github.com/clojure/core.unify)
* [Ticket system](http://dev.clojure.org/jira/browse/UNIFY)
* [Examples and documentation](http://fogus.me/fun/unifycle) -- in progress


Changes from version 0.5.1
--------------------------

* Removed all reflection warnings in the code. (thanks goes to André Thieme for pointing them out)
* More tests around common unification edge cases.

Plans
-----

The following capabilities are under design, development, or consideration for future versions of core.unify:

* High-performant unification based on unrolling recursive backtracking into polymorphic calls
* Iterative unification option
* Boolean unification
* Implicit variable recognition option(s)
* More examples
* More documentation

More planning is needed around capabilities not listed nor thought of.
