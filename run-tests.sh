#!/bin/sh

time clojure -M:test:runner-1.7:1.7
versions="1.8 1.9 1.10 1.11 1.12"
for v in $versions
do
  time clojure -M:test:runner:$v
done
time clojure -M:test:cljs-runner
