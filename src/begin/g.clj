(ns begin.g)

;; collection to single number

(def nums [64356 35 3457 34 5467 35 85 6235 547])

; how many numbers?
(count nums)

; highest and lowest number?

(apply max nums)

(apply min nums)

; sum of all numbers?

(reduce + nums)

; average of all numbers?
