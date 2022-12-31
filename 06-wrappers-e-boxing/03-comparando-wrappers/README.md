# Comparando Wrappers

Veja que interessante:

Se eu comparo dois valores primitivos iguais do tipo inteiro, o resultado é:

```java
public class Main {
  public static void main(String[] args) {
    int numero1 = 10;
    int numero2 = 10;

    System.out.println(numero1 == numero2); // true
  }
}
```

Mas se eu comparo dois valores que estão sendo referenciados por uma classe Wrapper, eu tenho:

```java
public class Main {
  public static void main(String[] args) {
    Integer numero1 = 128;
    Integer numero2 = 128;

    System.out.println(numero1 == numero2); // false
  }
}
```

Isso acontece porque as variáveis `numero1` e `numero2` estão sendo embrulhadas por uma classe wrapper
e ambas estão sendo referenciadas por objetos diferentes na memória. Então, de certa maneira estamos
comparando referências diferentes na memória. E sabamos que cada objeto aponta para um endereço diferente.

Mas, se os valores de `numero1` e `numero2` fossem 127, o resultado seria `true`.

```java
public class Main {
  public static void main(String[] args) {
    Integer numero1 = 127;
    Integer numero2 = 127;

    System.out.println(numero1 == numero2); // true
  }
}
```

Isso acontece pois, para valores de -128 até 127, o Java por debaixo dos panos o faz um `cache` dos valores, por
questões de otimização. Então fique atento a isso!!

Sabendo disso, não use o comparador `==` para variáveis que usam classes Wrapper.

Use o método `equals()`! Ele compara o conteúdo e não a referência do objeto na memória.

```java
public class Main {
  public static void main(String[] args) {
    Integer numero1 = 128;
    Integer numero2 = 128;
    Short numero3 = 128;

    System.out.println(numero1.equals(numero2)); // true
    System.out.println(numero1.equals(numero3)); // false
  }
}
```

Acima, a segunda comparação resulta em `false` pois o método `equals()` compara também o tipo da variável.

Certo, mas como faço para comparar esses valores, sabendo que, de certa maneira deveria dar `true`.

Nesse caso, você precisa converter esses tipos para primitivos, e usar o comparador `==`.

Veja abaixo:

```java
public class Main {
  public static void main(String[] args) {
    Integer numero1 = 128;
    Integer numero2 = 128;
    Short numero3 = 128;

    System.out.println(numero1.equals(numero2)); // true
    System.out.println(numero1.intValue() == numero3.intValue()); // true
  }
}
```