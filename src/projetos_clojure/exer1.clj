(ns projetos-clojure.exer1)

(def exercitando "entendo o quanto,")
(def para " estudar, ")

(defn clareza "faz nitido" [agora]
  (str "Vendo melhor, " agora))

(defn limpido "nada atrapalha" [visao]
  (str "é necessario " visao))

(println (clareza exercitando))
(println (limpido para))

(def estudando "fica mais ")
(def entendendo " melhora o entendimento")

(defn praticar  [agora]
  (str "e compreendendo isso " agora))

(defn e-necessario  [visao]
  (str "evidente, que a prática " visao))

(println (praticar estudando))
(println (e-necessario entendendo))


