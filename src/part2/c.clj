(ns part2.c
  (require [clojure.string :refer [capitalize]]))

;; vector of maps

(def workshop
  [
   {:first-name "liam"}
   {:first-name "carsten"}
   ]
  )

workshop

(map :first-name workshop)

(def first-names ["liam" "carsten"])

first-names

(map 
  #(assoc {} :first-name 
             (capitalize %)
             ) 
     first-names)