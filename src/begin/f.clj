(ns begin.f)

;; making longer vectors
;; conj

(conj [2 4] 6)

(conj [2 4] 6 235 53)

(concat [1 3 5] [2 4 6])

(conj [1 3 5] [2 4 6])

(def unsorted (concat [1 3 5] [2 4 6]))

unsorted

(sort unsorted)

(reverse unsorted)

(sort > unsorted)
