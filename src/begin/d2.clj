(ns begin.d2)

;; working with collections
;; filter

(def nums [1 2 3 4 5 6 7])

(filter even? nums)

(filter odd? nums)

(defn greater-than-four? [x]
  (> x 4))

(filter greater-than-four? nums)

nums