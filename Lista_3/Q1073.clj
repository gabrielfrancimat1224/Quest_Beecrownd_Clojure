(ns Lista-3.Q1073)

(def n (read-line))

(doseq [i (range 2 (inc n))
        :when (even? i)]
  (let [square (* i i)]
    (println i "^ 2 = " square)))


