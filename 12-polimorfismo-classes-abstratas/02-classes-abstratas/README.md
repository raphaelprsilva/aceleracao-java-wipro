# Classes Abstratas

## O que são classes abstratas?

Classes abstratas são classes que não podem ser instanciadas, ou seja, não podem ser utilizadas para criar objetos. Elas são utilizadas para definir uma estrutura de classes que possuem características em comum, mas que não podem ser utilizadas diretamente.

## Por que utilizar classes abstratas?

Imagine que você queira criar uma classe para representar um animal. Todos os animais possuem características em comum, como nome, idade, peso, etc. Porém, não faz sentido criar um objeto do tipo animal, pois não existe um animal genérico. Para isso, você pode criar uma classe abstrata chamada Animal, que possui as características em comum de todos os animais, e criar classes filhas que representam os animais específicos, como cachorro, gato, cavalo, etc.

## Como criar uma classe abstrata?

Para criar uma classe abstrata, você deve utilizar a palavra reservada `abstract` antes da palavra class. Veja o exemplo abaixo:

```java
public abstract class NotaFiscal {
  // ...
}
```

Essa classe não pode ser instanciada, pois ela é abstrata.
Ou seja, não é possível fazer o seguinte:

```java
NotaFiscal notaFiscal = new NotaFiscal();
```

Isso pois não existe um tipo de nota fiscal genérico. Cada nota fiscal é específica para um tipo de transação, como venda, compra, devolução, serviço, etc.


## Como criar métodos abstratos?

Métodos abstratos são métodos que não possuem implementação. Ou seja, eles não possuem corpo. Eles são utilizados para definir um comportamento que deve ser implementado pelas classes filhas. Para criar um método abstrato, você deve utilizar a palavra reservada `abstract` antes do tipo de retorno do método. Veja o exemplo abaixo:

```java
public abstract class NotaFiscal {
  public abstract double calcularImpostos();
}
```