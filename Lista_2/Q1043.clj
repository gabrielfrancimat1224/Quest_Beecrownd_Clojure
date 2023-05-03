(ns Lista_2.Q1043)

(let [valores (str/split (read-line) #" ")
      a (read-string (get valores 0))
      b (read-string (get valores 1))
      c (read-string (get valores 2))]

  (if (and (< (+ a b) c) (< (+ a c) b) (< (+ b c) a))
    (println (str "Perimetro = " (+ a b c)))
    (println (str "Area = " (* (/ (+ a b) 2) c)))))