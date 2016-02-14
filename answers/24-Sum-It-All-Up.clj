(= (reduce (fn [x y] (+ x y)) 0 [1 2 3]) 6)
; better
(= (reduce + (list 0 -2 5 5)) 8)
(= (apply + #{4 2 1}) 7)
