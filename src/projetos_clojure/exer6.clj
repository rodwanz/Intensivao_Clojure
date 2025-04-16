(ns projetos-clojure.exer6)


(defn faz-nada
  "Não a retorno!"
  [x] x)
(println (faz-nada "Nada"))


(defn de-todas-as-maneiras [& dormindo] 100)
(println (de-todas-as-maneiras ))


(defn fazendo-algo [x]
  (println "Não retorna nada!")
  (fn [& algo] x))
(println (fazendo-algo "Retorna x"))

(defn fazendo-algo-dois [x]
  (println "Aqui invoca a função retornada fazendo algo mais")
  (fn [& algo] x))
(println ((fazendo-algo-dois "Retorna x")))


(defn oposto [f]
  (fn [& args] (not (apply f args))))
(println ((oposto  even?) 1))


(defn contando-argumento
  ([])
  ([x] 1)
  ([x y] 2)
  ([x y & mais]
   (+ (contando-argumento x y) (count mais))))
(println(contando-argumento 1))
(println(contando-argumento 1 2))
(println(contando-argumento 1 2 3 4 5))
(println "Contando sempre o último elemento")


(defn somando [x]
  (let [y x]
    (fn [z] (+ y z))))
(def adiciona2 (somando 2))
(println(adiciona2 4))



