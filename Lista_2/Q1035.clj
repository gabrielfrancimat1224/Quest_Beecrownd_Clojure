(ns Lista_2.Q1035)

(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def A (read-string (get valores 0)))
(def B (read-string (get valores 1)))
(def C (read-string (get valores 2)))
(def D (read-string (get valores 3)))

(def somaCD (+ C D))
(def somaAB (+ A B))

(println (cond
      (and (> C 0) (> D 0) (even? A) (> somaCD somaAB))
      "Valores aceitos"
      :else
      "Valores nao aceitos"))