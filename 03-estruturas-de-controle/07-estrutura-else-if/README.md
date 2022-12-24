# Estrutura Condicional `else` e `else if`

A lógica da estrutura condicional do `if-else` é:

```
se (condição for verdadeira) {
    faça alguma coisa
} se não {
    faça outra coisa
}
```

```java
if (imc < 18.5) {
  System.out.println("Está abaixo do peso!");
} else {
  System.out.println("Está acima do peso!");
}
```

A lógica da estrutura condicional do `if-else-if` é:

```java
if (imc < 18.5) {
  System.out.println("Está abaixo do peso!");
} else if (imc < 25) {
  System.out.println("Está com peso normal!");
} else {
  System.out.println("Está abaixo do peso!");
}
```

## Desafio

Implemente um programa que obtém os valores como entrada do usuário e
imprime na tela o resultado (condição da pessoa), usando essas regras e
aplicando `if-else`.

Baseie-se na tabela abaixo:

![imc table](./imc-table-challange.png)