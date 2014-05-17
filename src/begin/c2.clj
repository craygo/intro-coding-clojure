(ns begin.c2)

;; naming

(def pi 3.1415926)

(def my-message "Hello world")

(defn square [x] 
  (* x x) )

(def some-numbers [1 2 3 4])

pi

my-message

(square 4)

some-numbers

(second some-numbers)

(square (second some-numbers))
