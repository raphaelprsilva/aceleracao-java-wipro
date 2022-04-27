# Desafio de Polimorfismo

Para este exercício, você criará quatro classes de veículos.

A primeira classe deve se chamar Carro. Esta será a classe base para três outras classes, Mitsubishi, Holden e Ford.

A primeira classe contém quatro atributos, ou campos, com estes nomes e condições:

- `engine` do tipo `booleano`

- `cylinders` do tipo `int`

- `name` do tipo `String`

- `wheels` do tipo `int`

Todas os quetro atributos devem ter acesso privado (`private`).

O construtor deve aceitar dois parâmetros, `cylinders` e `name`. Além disso, todos esses carros têm um motor e quatro rodas. Portanto, os outros dois campos devem ser definidos com valores padrão.

Além disso, existem outros cinco métodos. Esses métodos devem ser definidos conforme descrito abaixo:

- `startEngine` não aceita parâmetros e retorna uma mensagem informando que o motor do carro está dando partida.

- `accelerate` não aceita parâmetros e retorna uma mensagem informando que o carro está acelerando.

- `stop` não aceita parâmetros e retorna uma mensagem informando que o carro está freando.

As mensagens que esses métodos retornam devem conter em algum lugar o nome da classe, `Car`.

Dois métodos `getter` também devem ser definidos aqui para os atributos `cylinders` e `name`. Todos os métodos têm acesso público.
