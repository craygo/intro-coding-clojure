(ns begin.d3
  (require [clojure.string :refer [upper-case]]))

;; working with collections
;; map

(def names ["jane" "john" "jim"])

names

(map upper-case names)

(map clojure.string/capitalize names)

