(= ((fn [x] (* x 2)) 2) 4)
(= ((partial * 2) 4) 8)
(= (#(* % 2) 5) 10)