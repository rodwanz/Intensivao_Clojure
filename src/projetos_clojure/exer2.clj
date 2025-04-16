(ns projetos-clojure.exer2)

(def sim-vamos (str "Do que quer falar?"))
(defn entendimento-comum [certo]
  (str "me entende"))
(def que-acha? (str "me entende"))

(defn vamos-conversar? [atento]
  (conj sim-vamos))

(defn me-entenda? []
  (str "Que preciso estudar mais"
       (and (vamos-conversar? :nao)
            " e desenrolar meus estudos")))

(defn ficou-claro []
  (conj (entendimento-comum que-acha?)))

(println (vamos-conversar? sim-vamos))
(println (me-entenda?))
(println (ficou-claro))



(def podemos-sim (str "Sim entendo, então fará como?"))

(defn quero-conversar? [bom]
  (conj podemos-sim))

(defn entendeu? []
  (str "Estudarei mais,"
       (if (quero-conversar? :sim)
         " exercitando até a exatidão")))

(println (quero-conversar? podemos-sim))
(println (entendeu?))

