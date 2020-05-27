(ns clj.new.dorab-lib-template
  (:require [clj.new.templates :refer [renderer project-data ->files]]))

(defn dorab-lib-template
  "A project template for libraries, based on Dorab's preferences."
  [name]
  (let [render (renderer "dorab-lib-template")
        data   (merge {:description "FIXME: my new library."}
                      (project-data name)
                      {:developer "Dorab Patel"}
                      )]
    (println "Generating fresh 'clj new' dorab-lib-template project.")
    ;; (println (pr-str data))
    (->files data
             ["deps.edn" (render "deps.edn" data)]
             ["README.md" (render "README.md" data)]
             ["doc/intro.md" (render "intro.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/{{nested-dirs}}.clj" (render "foo.clj" data)]
             ["src/{{nested-dirs}}/specs.clj" (render "specs.clj" data)]
             ["src/{{nested-dirs}}/system.clj" (render "system.clj" data)]
             ["test/{{nested-dirs}}_test.clj" (render "test.clj" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["CHANGELOG.md" (render "CHANGELOG.md" data)]
             ["pom.xml" (render "pom.xml" data)]
             ["dev/logback.xml" (render "logback-dev.xml" data)]
             ["resources/{{artifact}}/system.edn" (render "system.edn" data)]
             ["logs/.keep" ""])))
