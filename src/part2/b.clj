(ns part2.b)

;; datastructure: map

; keyword

:first-name

:last-name

{:first-name "harry" :last-name "binnendijk"}

(def me {:first-name "harry" :last-name "binnendijk"})

(def me2 (assoc me :likes-to "code"))

(:likes-to me2)

