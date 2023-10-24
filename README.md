<h2>Atividade 1: Paradigmas de Liguagens de Programação </h2>

> Tema: Treinador Pokémon

> Atividade desenvolvida por: Juan Gustavo, Lucas Emanoel e Vandielson Tenório

<h3>Descrição da Atividade</h3>

Trata-se de um mini sistema desenvolvido em uma linguagem estruturada (C) e em uma linguagem Orientada a Objetos (Java), com o intuito de relatar quais as principais vantagens e desvantagens encontradas durante o desenvolvimento para cada um dos paradigmas.

O projeto consiste em um pequeno cadastro de treinadores pokémons, onde é feito o gerenciamento dos dados do treinador, como nome e idade, as insígnia que possui e o seu time de pokémons. Para cada Pokémon é adicionado o nome, tipo e evolução.

<h3>Desenvolvimento em C (Programação Estruturada)</h3>

* Definição das Estruturas de Dados: Em C, foram usadas estruturas (structs) para representar o pokémon, time, pessoa e treinador.

* Funções para Manipulação: Foram criadas funções para adicionar, exibir e gerenciar cada uma das informações iseridas. Por exemplo, isso inclui funções para adicionar um pokémon, exibir todas os pokémons e procurar um pokémon específico.

* Gerenciamento de Memória: Em C, a alocação e liberação de memória foram feitas manualmente.

* Controle de Fluxo: Uso de estruturas de controle como loops (for, while) e estruturas condicionais (if, else) para controlar o fluxo do programa.

<h3>Desenvolvimento em Java (Programação Orientada a Objetos)</h3>

* Definição de Classes: Em Java, foram criadas classes para representar o pokémon, time, pessoa e treinador. Por exemplo, a classe Pokemon, cada instância dessa classe contém atributos como nome, tipo, evolução, etc.

* Métodos de Classe: Implementado métodos na classe para adicionar, exibir e gerenciar informações. Os métodos adicionarPokemon(), exibirPokemon(), e procurarPokemon(), por exemplo.

* Encapsulamento: Utilização dos modificadores de acesso (public, private) para encapsular os atributos e garantir que o estado de cada classe seja protegido.

* Gerenciamento Automático de Memória: Java lida com a alocação e liberação de memória automaticamente. Não foi necessário se preocupar com a alocação de memória.

<h3>Principais Diferenças e Dificuldades</h3>

* Em C, é necessário gerenciar manualmente a alocação e liberação de memória, enquanto em Java, o gerenciamento de memória é automático. Portanto C é mais propensa a erros.

* Java facilita o reuso de código por meio da herança e da composição de objetos. Em C, é necessário criar funções para operar em estruturas de dados, e o reuso de código é mais manual.

* Em Java, os dados são encapsulados em classes, tornando mais fácil gerenciar e manter a integridade dos dados. Em C, os dados são expostos diretamente, o que pode exigir mais cuidado na manipulação.

* Java pode ser mais complexo devido à orientação a objetos e à necessidade de criar classes separadas. C é mais simples, mas requer maior responsabilidade no gerenciamento de dados.

* Ambas as linguagens têm diferentes sintaxes e paradigmas, o que pode exigir um ajuste na forma de pensar e programar.

<h3>Conclusão</h3>

Em resumo, o projeto em Java oferece recursos de orientação a objetos, tornando a organização e a manutenção do código mais intuitivas, mas pode ser mais verboso. O projeto em C segue um estilo mais linear e procedural, exigindo um gerenciamento mais direto dos dados e operações. A escolha entre os dois depende dos requisitos do projeto e das preferências de desenvolvimento.