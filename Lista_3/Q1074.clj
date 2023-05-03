(ns Lista-3.Q1074)

(defn ehPar [x]
  (zero? (mod x 2)))

(defn positive [x]
  (> x 0))

(defn negative [x]
  (< x 0))

(defn classify-number [x]
  (cond
    (zero? x) "NULL"
    (ehPar x) "EVEN"
    :else "ODD"))

(defn classify-number2 [x]
  (cond
    (positive x) "POSITIVE"
    (negative x) "NEGATIVE"))

(def n (read-string (read-line)))

(dotimes [_ n]
  (let [x (read-string (read-line))
        classification (classify-number x)
        classification_2 (classify-number2 x)]

    (println (str classification " " classification_2))))

