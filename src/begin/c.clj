(ns begin.c
  (use [clojure.repl]))

(nth "Hello World" 2)

(def s "Hello World")

s

(nth s 2)

(third "Hello World")

(defn third [x]
  (nth x 2))

(third s)
