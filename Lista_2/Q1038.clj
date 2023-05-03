(ns Lista_2.Q1038)

(let [codg (read)
      qtd (read)
      valor (cond
              (= codg 1) 4.00
              (= codg 2) 4.50
              (= codg 3) 5.00
              (= codg 4) 2.00
              (= codg 5) 1.50)]
  (println (format "Total: R$ %.2f" (* valor qtd))))