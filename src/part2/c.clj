(ns part2.c
  (require [clojure.string :refer [capitalize join]]))

;; vector of maps

(def workshop
  [
   {:first-name "liam" :likes "startups"}
   {:first-name "carsten" :likes "php"}
   {:first-name "harry" :likes "startups"}
   ]
  )

workshop

(map :first-name workshop)

(defn string-first-names [people]
  (join ", " (map :first-name people)))

(string-first-names workshop)

(map :likes workshop)

(group-by :likes workshop)

(first (group-by :likes workshop))

(second (group-by :likes workshop))

(map (fn [x] (type x)) (group-by :likes workshop))
     
(map (fn [[thing people]] people) (group-by :likes workshop))

(defn likes-thing [[thing people]]
  (str "people who like " thing ": "
        (string-first-names people)))

(map likes-thing (group-by :likes workshop))

