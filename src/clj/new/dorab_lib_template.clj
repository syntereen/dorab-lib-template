(ns clj.new.dorab-lib-template
  (:require [clj.new.templates :refer [renderer project-data ->files]]))

(defn dorab-lib-template
  "FIXME: write documentation"
  [name]
  (let [render (renderer "dorab-lib-template")
        data   (project-data name)]
    (println "Generating fresh 'clj new' dorab-lib-template project.")
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["src/{{nested-dirs}}/foo.clj" (render "foo.clj" data)])))
