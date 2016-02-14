(= (#(first (reverse %)) [1 2 3 4 5]) 5)
(= ((comp first reverse) '(5 4 3)) 3)
(= ((fn [x]
      (if-let [r (next x)]
        (recur r)
        (first x)))  ["b" "c" "d"]) "d")
