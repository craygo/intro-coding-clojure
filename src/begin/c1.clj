(ns begin.c1)

;; naming and a function

(def s "Hello World")

(nth s 2)

(defn third [x]
  (nth x 2))

(third s)
