(ns part2.c2
    (require [clojure.string :refer 
              [capitalize join]]))

(def workshop
  [
   {:first-name "liam" :likes "startups"}
   {:first-name "carsten" :likes "php"}
   {:first-name "harry" :likes "startups"}
   ]
  )

(def first-names (map :first-name workshop))

(map 
  #(assoc {} :first-name 
             (capitalize %)
             ) 
     first-names)