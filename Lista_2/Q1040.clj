(ns Lista_2.Q1040)


(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))

(def n1 (read-string (get valores 0)))
(def n2 (read-string (get valores 1)))
(def n3 (read-string (get valores 2)))
(def n4 (read-string (get valores 3)))


(let [media (* (+ (* n1 2) (* n2 3) (* n3 4) (* n4 1)) 0.1)]
   (println (str "Media: " (format "%.1f" media)))
   (cond
     (>= media 7.0) (println "Aluno aprovado.")
     (< media 5.0) (println "Aluno reprovado.")
     :else (do
             (println "Aluno em exame.")
             (let [nota-exame (read)]
               (println (str "Nota do exame: " (format "%.1f" nota-exame)))
               (let [media-final (/ (+ media nota-exame) 2)]
                 (if (>= media-final 5.0)
                   (println "Aluno aprovado.")
                   (println "Aluno reprovado."))
                 (println (str "Media final: " (format "%.1f" media-final))))))
     true (println "Erro: média fora da faixa especificada.")))


