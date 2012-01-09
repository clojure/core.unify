# clojure.core.unify

core.unify is a Clojure contrib library providing the following features:

* Factory functions for constructing unification binding, subst, and unification functions, with or without occurs checking

* Packaged functions for unification binding, subst, and unification functions, with or without occurs checking, recognizing variables tagged as symbols prefixed with `?` characters

core.unify is based on a library named Unifycle, found at http://github.com/fogus/unifycle that has been deprecated.

*[more information](http://fogus.me/fun/unifycle)*

Example
-------

```clojure
(unifier '((?a * ?x ** 2) + (?b * ?x) + ?c) 
         '(?z + (4 * 5) + 3))
    
;=> ((?a * 5 ** 2) + (4 * 5) + 3)
```

Getting core.unify
------------------

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


Plans and ideas
---------------

The following capabilities are under design, development, or consideration for future versions of core.unify:

* High-performant unification based on unrolling recursive backtracking into polymorphic calls
* Iterative unification option
* Boolean unification
* Implicit variable recognition option(s)
* More examples
* More documentation

More planning is needed around capabilities not listed nor thought of.


References
----------

- *PAIP* by Peter Norvig
- [Michał Marczyk's impl](http://gist.github.com/374764)
- *The Art of Prolog* by Leon Sterling and Ehud Shapiro
- *Programming Languages: Application and Interpretation* by Shriram Krishnamurthi [here](http://www.cs.brown.edu/~sk/Publications/Books/ProgLangs/2007-04-26/)
- [CL-unification](http://common-lisp.net/cgi-bin/viewcvs.cgi/cl-unification/?cvsroot=cl-unification)
- *The Scheme Programming Language* by Kent Dybvig
- *Problem-solving Methods in Artificial Intelligence* by Nils Nilsson
- <http://books.google.com/books?id=UjrJDvu2fxkC&lpg=PA53&ots=EVEddEEeqQ&dq=occurs-check%20table&pg=PA53#v=onepage&q&f=false>

License
-------

Copyright © 2011 Rich Hickey

Licensed under the EPL. (See the file epl.html.)
