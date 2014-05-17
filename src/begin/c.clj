(ns begin.c)

;; naming and a function

(nth "Hello World" 2)

(def s "Hello World")

s

(nth s 2)

(third s)

(defn third [x]
  (nth x 2))
