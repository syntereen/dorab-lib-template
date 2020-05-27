(ns {{namespace}}
  (:require [clojure.spec.alpha :as s]
            [cambium.core :as log]
            [{{namespace}}.specs :as {{artifact}}s]
            )
  )

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
