(ns Lista-3.Q1075)

(def n (read-line))

(dotimes [i 10000]
  (when (= (mod i n) 2)
    (println i)))