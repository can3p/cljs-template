(defproject lein-cljsbuild-example "0.0.1"
  :plugins [[lein-cljsbuild "0.3.0"]]
  :cljsbuild {
    :builds [{
        :source-paths ["src"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :output-to "public/app.js"
          :optimizations :whitespace
          :pretty-print true}}]})
