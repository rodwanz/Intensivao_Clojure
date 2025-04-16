(ns projetos-clojure.exer7
  (:use clojure.pprint))

(def assunto ["Java" "Spring Boot"])
(def algo-a-mais ["Node" "Clojure"])

(defn entendo-melhor [estudar praticar]
  {:estudar-praticar estudar
   :praticar-estudar praticar})
(doseq [resultado (map entendo-melhor assunto algo-a-mais)]
  (println "Combinando conhecimento: " resultado))








