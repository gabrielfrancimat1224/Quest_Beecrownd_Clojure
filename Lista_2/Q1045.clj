(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))


(defn ordena [a b c]
  (let [[menor meio maior] (sort [a b c])]))


(defn tipo-triangulo [a b c]
  (let [a2 (* a a)
        b2 (* b b)
        c2 (* c c)]
    (cond
      (>= a (+ b c)) "NAO FORMA TRIANGULO"
      (= a2 (+ b2 c2)) "TRIANGULO RETANGULO"
      (> a2 (+ b2 c2)) "TRIANGULO OBTUSANGULO"
      (< a2 (+ b2 c2)) "TRIANGULO ACUTANGULO"
      (= a b c) "TRIANGULO EQUILATERO"
      (or (= a b) (= a c) (= b c)) "TRIANGULO ISOSCELES")))

(ordena a b c)
(doseq [tipo (tipo-triangulo a b c)]
  (print tipo))