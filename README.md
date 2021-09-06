# Jardim :evergreen_tree: :tulip: :grapes:
Este projeto tem como objetivo principal representar de maneira simples um jardim utilizando o paradigma de programação orientada a objetos.
Nesse README vou explicar de maneira simples o que eu pensei para fazer esse projeto.

## Ideação 
Para resolver o problema do jardim eu decidi primeiro pesquisar sobre as árvores para entender mais sobre características básicas das mesmas, durante a pesquisa descobri que **Árvores** fazem parte do Reino Plantae ou Reino **Vegetal**  e dai tirei o nome e características das principais classes do projeto, sendo a **classe Vegetal a classe mãe da classe Árvore**

## Classes
### Vegetal
A classe abstrata **Vegetal** (por ser algo conceitual como ensinado no curso 3 de Java) tem alguns atributos básicos como:
 - nomeCientifico (Nome cientifico do vegetal)
 - corDestaque (Cor de destaque do vegetal)
 - contador (atributo estático utilizado para somar a quantidade total de vegetais)

### Arvore
A classe **Árvore** herda de **Vegetal** e adiciona outros atributos:
- nomePopular (Nome popular da árvore)
- alturaMaxima (Altura máxima da vegetação)
- idade (idade da arvore plantada, que pode ser reconhecida pela quantidade de anéis que a arvore tem em sua base)
- contador (contador estático de árvores plantadas)
### Fruto
A classe **Fruto** foi criada apenas para mostrar o conceito de polimorfismo no método Main, **Fruto** também herda de **Vegetal** e adiciona outros atributos:
- nomePopular (Nome popular do fruto)
- contador (contador estático de árvores plantadas)
