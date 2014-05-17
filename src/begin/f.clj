(ns begin.f)

;; making longer collections

(conj [2 4] 6)

(conj [2 4] 6 235 53)

(concat [1 3 5] [2 4 6])

(def unsorted (concat [1 3 5] [2 4 6]))

(sort unsorted)

(reverse unsorted)
