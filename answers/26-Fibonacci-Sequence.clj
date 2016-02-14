(= (#(map last (take %1 (iterate (fn [[x y]] [y (+ x y)]) [0 1]))) 3) '(1 1 2))
(= (#(take % (map last (iterate (fn [[x y]] [y (+ x y)]) [0 1]))) 6) '(1 1 2 3 5 8))
