# Métodos de conversão

Existem métodos que auxiliam na conversão de tipos primitivos.

Vamos ver alguns exemplos:

```java
public class Main {
  public static void main(String[] args) {
    int idade = 20;

    // isso se chama "casting" ou conversão
    short idadeShort = (short) idade;

    Integer diasEntrega = Integer.valueOf(20);
    Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());
    
    Double valorTotal = Double.valueOf(1400.43);

    // aqui eu perco a precisão do meu valor original
    // pois estamos convertendo para um inteiro
    Integer valorTotalInt = valorTotal.intValue();
    System.out.println(valorTotalInt);
  }
}
```

## Autoboxing e Unboxing

Quando fazemos isso:

- `Integer diasEntrega = Integer.valueOf(20);`

É como se estivéssemos fazendo algo desnecessário, e chamamos isso de `boxing`. Bastaria fazer assim:

- `Integer diasEntrega = 20;`

Da maneira como fizemos acima, o compilador por debaixo dos panos já faz o `boxing` pra nós.

Então, poderíamos reescrever as linhas assim:

```java
public class Main {
  public static void main(String[] args) {
    int idade = 20;

    // isso se chama "casting" ou conversão
    short idadeShort = (short) idade;

    Integer diasEntrega = 20;
    Short diasEntregaShort = Short.valueOf(20);
    
    Double valorTotal = 1400.43;

    // aqui eu perco a precisão do meu valor original
    // pois estamos convertendo para um inteiro
    Integer valorTotalInt = valorTotal.intValue();
    System.out.println(valorTotalInt);
  }
}
```