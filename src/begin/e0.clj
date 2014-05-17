(ns begin.d3
  (require [clojure.string :refer [upper-case]]))

;; working with vectors
;; map

(def names ["jane" "john" "jim"])

names

(map upper-case names)

(map clojure.string/capitalize names)

