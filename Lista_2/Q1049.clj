
(defn determina-animal [palavra1 palavra2 palavra3]
  (cond (= palavra1 "vertebrado") (cond (= palavra2 "ave") (cond (= palavra3 "carnivoro") "aguia"
                                                                 (= palavra3 "onivoro") "pomba")
                                        (= palavra2 "mamifero") (cond (= palavra3 "onivoro") "homem"
                                                                      (= palavra3 "herbivoro") "vaca"))

        (= palavra1 "invertebrado") (cond (= palavra2 "inseto") (cond (= palavra3 "hematofago") "pulga"
                                                                        (= palavra3 "herbivoro") "lagarta")
                                        (= palavra2 "anelideo") (cond (= palavra3 "hematofago") "sanguessuga"
                                                                      (= palavra3 "onivoro") "minhoca"))
        ))

(def vertebrado (read-string (read-line)))
(def classe (read-string (read-line)))
(def alimentacao (read-string (read-line)))

(println (determina-animal vertebrado classe alimentacao))

