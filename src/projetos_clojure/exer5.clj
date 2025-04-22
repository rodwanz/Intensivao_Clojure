(ns projetos-clojure.exer5
  (:use clojure.pprint))

(def lista-de-compras ["Arroz" "Feijão" "Açúcar" "Macarrão" "Óleo"])
(let [itens-da-lista (take 2 lista-de-compras)]
  (println itens-da-lista))
(let [[outra-lista & outros-itens] lista-de-compras] [outra-lista outros-itens]
                                                     (println "Toda a lista: " lista-de-compras))

(println "\n")

(defn minhas-compras []
  ["Arroz" "Feijão" "Açúcar" "Macarrão" "Óleo" "Papel-higienico" "Pasta de dente"])

(defn o-que-comprar [lista1]
  (println "O que tem pra comprar: " lista1))
(let [eh-so-estes (take 3 (minhas-compras))]
  (println "Traz só estes: " eh-so-estes))
(let [lista1 (minhas-compras)]
  (o-que-comprar lista1) (println "Lista completa" lista1))


(println "\n")

(defn todos-os-itens []
  ["Arroz" "Feijão" "Açúcar" "Macarrão" "Óleo" "Manteiga" "Frango" "Papel-higienico" "Pasta de dente"])

(defn itens-que-faltam [itens]
(let [[item1 _ _ _ _ _ _  item9 & depois-compro :as lista-toda] itens]
  (println "O primeiro e o nono item da lista são: " item1 "e" item9)
  (println "Estes preciso que compre depois " depois-compro)
  (println "O que compro todo mês " lista-toda)))
(println (itens-que-faltam (todos-os-itens)))









