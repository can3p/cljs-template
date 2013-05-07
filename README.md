# What is it?

cljs-template is a template for building clojurescript apps.

# Bootstrap

Run deps task to download all dependent libraries

$ lein deps

# Usage

To build once run:
$ lein cljsbuild once


To run in watch mode run

$ lein cljsbuild watch

# repl

Run the following command to get into the cljs repl (Warning: it will also download some packages from the internet)

$ lein trampoline cljsbuild repl-rhino

See https://github.com/emezeske/lein-cljsbuild/blob/master/README.md for details
