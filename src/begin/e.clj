(ns begin.e)

;; combining 

(def nums [1 2 3 4 5 6 7])

(defn square [x] 
           (* x x) )

(map square nums)

(filter odd? nums)

(map square (filter odd? nums))

(filter odd? (map square nums))
