(ns Lista-2.Q1047)

(def valores (str/split (read-line) #" "))

(def horas_i (read-string (get valores 0)))
(def minutos_i (read-string (get valores 1)))
(def horas_f (read-string (get valores 2)))
(def minutos_f (read-string (get valores 3)))

(let [inic_min (+ (* horas_i 60) minutos_i)
      fim_min (+ (* horas_f 60) minutos_f)
      dura_min (if (<= inic_min fim_min)
                           (- fim_min inic_min)
                           (- (+ (* 24 60) fim_min) inic_min))
      dura_hr (quot dura_min 60)
      dura_min (mod dura_min 60)]

  (println (str "O JOGO DUROU " dura_hr " HORA(S) E " dura_min " MINUTO(S)")))