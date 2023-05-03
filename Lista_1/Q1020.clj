;(ns Q1020)

(def N (read-string (read-line)))
(def ano (quot N 365))
(def resto (- N (* 365 ano)))
(def mes (quot resto 30))
(def dia (- resto (* 30 mes)))

(println (format "%d ano(s)" ano))
(println (format "%d mes(s)" mes))
(println (format "%d dia(s)" dia))