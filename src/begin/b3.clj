(ns begin.b3)

; first and rest

(rest "Hello World")

(rest (rest "Hello World"))

(first (rest (rest "Hello World")))

(->
  "Hello World"
  rest
  rest
  first)