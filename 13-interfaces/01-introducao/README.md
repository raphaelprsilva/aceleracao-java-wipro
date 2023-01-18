# Introdução

Interfaces são um dos pilares da programação orientada a objetos. Elas são muito importantes para o desenvolvimento de aplicações, pois permitem que você crie um contrato entre classes, que são implementadas por classes concretas.

## O que é uma interface?

Uma interface é uma estrutura que define um contrato entre classes.
Ela define um conjunto de métodos que devem ser implementados por classes que a implementam.
Esses métodos não possuem implementação, apenas a assinatura. Ou seja, é como se fosse um contrato que define o que deve ser feito, mas não como deve ser feito.

## Por que usar interfaces?

Interfaces são muito importantes para o desenvolvimento de aplicações, pois permitem que você crie um contrato entre classes, que são implementadas por classes concretas.
Elas estão presentes em praticamente todos os frameworks e bibliotecas que você utiliza no dia a dia.

## Exemplo

Vamos criar uma interface chamada `Animal` que define um método chamado `falar()`.

```java
public interface Animal {
    void falar();
}
```