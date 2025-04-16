(ns projetos_clojure.core)

(defn error-message [serenidade]
  (str "OH DEUS! QUE MARAVILHOSO "
       (if (= serenidade :suave)
         "SEGUINDO PARA O ENTENDIMENTO!"
         "CONDENADOS!")))


(println(error-message :suave))

