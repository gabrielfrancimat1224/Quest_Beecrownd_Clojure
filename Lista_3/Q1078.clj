(ns Lista-3.Q1078)

(let [n (read-string (read-line))]
  (dotimes [i 10]
    (let [x (inc i)]
      (println (str x " x " n " = " (* x n))))))