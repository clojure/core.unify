**clojure.core.unify - A Clojure Unification Library** 

([more information](http://fogus.me/fun/unifycle))

Example
-------

```clojure
(unifier '((?a * ?x ** 2) + (?b * ?x) + ?c) 
         '(?z + (4 * 5) + 3))
    
;=> ((?a * 5 ** 2) + (4 * 5) + 3)
```

TODO
----

- Tabling (in progress -- buggy)
- Examples (algebra+)
- Examples (destructuring)

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
