(ns projetos-clojure.exer3)

(def das-tarefas ", com mais clareza,")
(def praticando "com Clojure")
(def dando-as-caras "estudar mais, ")
(def seguindo " e mais foco")

(defn exercitando
  "Tenho que estudar mais" []
  (str "Para ser mais efetivo " praticando " preciso" das-tarefas " estudar melhor"))

(defn estudar
  "Muito mais" []
  (str "e com isso, " dando-as-caras "com firmeza " seguindo " até entender"))

(println (exercitando))
(println (estudar ))
;(estudar praticando)










