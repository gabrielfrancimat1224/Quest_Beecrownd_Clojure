;(ns Q1019)

(def N (read-string (read-line)))
(def hrs (quot N 3600))
(def resto (- N (* 3600 hrs)))
(def mint (quot resto 60))
(def seg (- resto (* 60 mint)))

(println (format ("%d:%d:%d" hrs mint seg)))