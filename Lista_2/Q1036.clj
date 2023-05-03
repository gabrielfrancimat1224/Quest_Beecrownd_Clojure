(ns 1036)

(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))

(def delta (- (* b b) (* 4 a c)))

(def R1 (/ (+ (* -1 b) (Math/sqrt delta)) (* 2 a)))
(def R2 (/ (- (* -1 b) (Math/sqrt delta)) (* 2 a)))

(println
  (cond
    (or (= a 0.0) (< delta 0.0))
       "Impossivel calcular"
       :else
        (format "R1 = %.5f\nR2 = %.5f" R1 R2)
       ))