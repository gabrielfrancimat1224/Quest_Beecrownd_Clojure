(ns Lista-3.Q1070)

(def X (read-string (read-line)))

(if (even? X) (inc X))

(dorun (map println (filter odd? (range X (inc (+ X 12)) 2))))
