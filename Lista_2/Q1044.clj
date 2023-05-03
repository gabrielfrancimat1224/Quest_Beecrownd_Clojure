(ns Q1044)

(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))

  (println
    (if (zero? (mod a b))
    "Sao Multiplos"
    "Nao sao Multiplos"))
