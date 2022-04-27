# Desafio de Polimorfismo

Para este exercício, você criará quatro classes de veículos.

A primeira classe deve se chamar `Car`. Esta será a classe base para três outras classes, `Mitsubishi`, `Holden` e `Ford`.

A classe `Car` contém quatro atributos, ou campos, com estes nomes e condições:

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

As outras três classes mencionadas acima são subclasses de `Car`.

Essas classes não têm atributos e o construtor de cada uma chamará o construtor pai para instanciação do objeto.

Cada uma dessas classes substituirá (fará `override`) os três métodos pai `startEngine`, `accelerate` e `stop`.

As mensagens de retorno para esses métodos devem conter em algum lugar o nome da classe à qual os métodos pertencem.

### Exemplo de input

``` java
    Car car = new Car(8, "Base car");
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.stop());

    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX4WD");
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.stop());

    Ford ford = new Ford(6, "Ford Falcon");
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.stop());

    Holden holden = new Holden(6, "Holden Commodore");
    System.out.println(holden.startEngine());
    System.out.println(holden.accelerate());
    System.out.println(holden.stop());
``` 

### Exemplo de output

``` 
    Car -> startEngine()
    Car -> accelerate()
    Car -> brake()
    Mitsubishi -> startEngine()
    Mitsubishi -> accelerate()
    Mitsubishi -> brake()
    Ford -> startEngine()
    Ford -> accelerate()
    Ford -> brake()
    Holden -> startEngine()
    Holden -> accelerate()
    Holden -> brake()
``` 
