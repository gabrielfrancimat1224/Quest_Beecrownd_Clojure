(ns Q1052)

(def num_mes (read-string (read-line)))

(cond
  (= num_mes 1) (println "January")
  (= num_mes 2) (println "February")
  (= num_mes 3) (println "March")
  (= num_mes 4) (println "April")
  (= num_mes 5) (println "May")
  (= num_mes 6) (println "June")
  (= num_mes 7) (println "July")
  (= num_mes 8) (println "August")
  (= num_mes 9) (println "September")
  (= num_mes 10) (println "October")
  (= num_mes 11) (println "November")
  (= num_mes 12) (println "December")
  :else (println "Invalid month. Please enter a number between 1 and 12."))