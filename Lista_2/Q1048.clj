(ns Q1048)

(def salary (read-string (read-line)))
(def reajuste)

(def novo-salario
  (cond
    (<= salary 400.00)
    (do
      (def reajuste 0.15)
      (+ salary (* salary reajuste)))

    (<= salary 800.00)
    (do
      (def reajuste 0.12)
      (+ salary (* salary reajuste)))

    (<= salary 1200.00)
    (do
      (def reajuste 0.10)
      (+ salary (* salary reajuste)))

    (<= salary 2000.00)
    (do
      (def reajuste 0.07)
      (+ salary (* salary reajuste)))

    :else
    (do
      (def reajuste 0.04)
      (+ salary (* salary reajuste)))))

(println
  (format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%"
          novo-salario
          (* salary reajuste)
          (* 100 reajuste)))


