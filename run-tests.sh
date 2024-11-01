#!/bin/sh

versions="1.7 1.8 1.9 1.10 1.11 1.12"
for v in $versions
do
  time clj -M:test:runner:$v
done
