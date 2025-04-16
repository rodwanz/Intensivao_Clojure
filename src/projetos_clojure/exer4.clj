(ns projetos-clojure.exer4
  (:require clojure.string))

(defn construtor-mensagens [saudacoes]
  (fn [quem] (println saudacoes quem)))
(def esta-e-a-mensagem (construtor-mensagens "Se ligou!"))
(println(esta-e-a-mensagem " Ficando esperto!"))

(println "\n")

(defn construindo-lacos [aplica ve-se-da-certo]
  (fn [quando] (println aplica ve-se-da-certo quando)))
(def se-liga-na-mensagem (construindo-lacos "Presta atenção agora!" "Aprende!" ))
(println(se-liga-na-mensagem "É o melhor pra você!"))

(println "\n")

(defn entusiasmado
  "Retorna um clamor entusiasmado"
  [nome]
  (str "Excelente " nome " você é muito bom," " e que consiga alcançar o esperado"))
(println(entusiasmado "Miguel"))

(println "\n")

(defn muitos-argumentos
  "Descrevendo o que venho fazendo"
  ([lendo meditando exercitando]
   (str "Eu tenho " lendo " sobre Clojure "
        meditando " se vale o esforço " exercitando " o aprendozado fique claro")))
(println(muitos-argumentos "lido muito" "refletindo bastante"
                           " para que, atraves de muito exercicio"))

(println "\n")

(defn varios-argumentos [muitos]
  (let [[ler entender praticar] muitos]
    (println "lendo muito até cansar:" ler ", fazer muita abstração:"
             entender ", prátiva deliberada:" praticar )))
(println(varios-argumentos "Até a exaustão!"))


(defn golpe
  "Descrevendo um tipo de golpe"
  ([nome tipo-golpe]
   (str "Eu " tipo-golpe " golpeei " nome "! Seguuuura essa pedrada!"))
  ([nome]
   (golpe nome "Miguel")))
(println(golpe "Rodrigo" "chute"))
(println(golpe "Rodrigo"))

(println "\n")

(defn comunicacao-codger [sniper]
  (str "Saia do meu caminho, " sniper "!!!!"))
(defn codger [& sniper]
  (map comunicacao-codger sniper))
(println(codger "Death" "Escuro" "Maltratado"))

(println "\n")

(defn meus-favoritos [nome & coisas]
  (str "Oi, " nome " estas são as minhas coisas favoritas: "
       (clojure.string/join ", " coisas)))
(println(meus-favoritos "Meu amigo" "estudar" "amar minha família" "Deus"))

(println "\n")

(defn utensilios [cozinha]
  (str "Tõ de precisando, " cozinha "!"))
(defn preciso-hoje [& cozinha]
  (map utensilios cozinha))
(println(preciso-hoje "panela" "frigideira" "de talheres"))

(println "\n")

(defn mapeia-nome [todos]
  (str "Que eu consiga!" todos ))
(println(mapeia-nome "Tem que dar bom! "))

(println "\n")

(defn nossos-nomes []
  (map (fn [nomes] (str "Oi, " nomes))
       ["Rodrigo Wanzeler" "Susanne de Jesus" "Miguel Wanzeler"]))
(println(nossos-nomes))

(println "\n")

(defn materias [estudar]
  (str estudar " O que preciso estudar dessas máterias"))
(println(map materias ["Java" "Spring Boot"]))
(println(map materias `("JavaScrpit" "Node JS")))
(println(map materias #{"Clojure" "Elixir"}))
(println (map #(materias (second %)) {:preciso-estudar "React"}))
(println(materias "Muito!"))


(defn pegando-no-mapa [pegar-o-que]
  (str pegar-o-que "Caneta: material retirado"))
(println(map #(pegando-no-mapa (second %)) {:tirar "Liberdo "}))






