# Classes Abstratas

As classes abstratas são usadas em contextos de herança. Como assim?

Pense em animais. Podemos ter 'n' animais diferentes, certo?

Cavalo, macaco, pássaro e etc...

Então, eu posso criar uma Classe `Animal` genérica, que possui características comuns entre todos os animais, como por exemplo:

- `nome`
- `idade`

Eu poderia criar então, uma classe `Bird` que representa todos as aves. Mas, vamos fazer dela, uma classe abstrata.

Como assim? Nós vamos dizer que essa classe não pode ser instanciada, ou seja, eu preciso criar outra classe que estende a classe `Bird`.

Para isso, vou criar uma classe mais específica, chamada `Pinguin`.

Dê uma olhadinha nas classes e veja como foi implementada a lógica.

