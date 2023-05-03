(ns 1037)

(def val (read-string (read-line)))

(println
  (cond
    (and (>= val 0) (<= val 25))
    "Intervalo [0,25]"
    (and (> val 25) (<= val 50))
    "Intervalo (25,50]"
    (and (> val 50) (<= val 75))
    "Intervalo (50,75]"
    (and (> val 75) (<= val 100))
    "Intervalo (75,100]"
    :else
    "Valor fora do intervalo [0,100]"
    ))

