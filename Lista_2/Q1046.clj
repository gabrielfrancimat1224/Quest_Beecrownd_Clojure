(ns Lista_2.Q1046)

(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def horas_i (read-string (get valores 0)))
(def horas_f (read-string (get valores 1)))


duracao (if (= horas_i horas_f)
                (def duracao 24)
                (if (<= horas_i horas_f)
                  (- horas_f horas_i)
                  (- (+ 24 horas_f) horas_i)))

(println (str "O JOGO DUROU " duracao " HORA(S)"))
