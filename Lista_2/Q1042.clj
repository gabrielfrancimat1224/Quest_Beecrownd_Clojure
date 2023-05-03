(ns Lista_2.Q1042)

(defn sort-and-print [a b c]
  (let [vec (sort [a b c])]
    (doseq [num vec]
      (println num))
    (println)
    (doseq [num [a b c]]
      (println num))))

(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))

;; Exemplo de uso:
(sort-and-print a b c)
