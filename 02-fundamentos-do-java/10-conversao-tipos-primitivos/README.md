# 🔁 Conversão de Tipos Primitivos

O `casting` ou conversão, é algo muito comum quando estamos programando.

Exemplo inicial:

```java
public class ConversaoLongToInt {
  public static void main(String[] args) {
    long x = 11;
    
    // não compila
    int y = x;
  }
}
```

Se tentarmos atribuir um valor do tipo `long` para `int`, ocorrerá um erro de compilação.

O compilador dirá que ocorre um erro de precisão ao tentar fazer a atribuição pois são tipos incompatíveis.

O tipo `long` possui 64 bits, sendo assim, imagine que são reservados "64 espaços" na memória para a variável.

Já o tipo `int` possui 32 bits, são reservados "32 espaços" de memória para a variável.

Sendo assim, não dá para alocar "64 espaços" dentro de "32 espaços". Por isso ocorre o erro.

Mas o Java é uma linguagem versátil, sendo assim, se você tem certeza que dá para converter, dará para fazer a conversão (`casting`).

Veja o exemplo abaixo. Nele estamos assumindo o risco de fazer o casting:

```java
public class ConversaoLongToInt {
  public static void main(String[] args) {
    long x = 11;
    // int y = x;

    int y = (int) x;
    System.out.println("x = " + x);
  }
}
```

Outro exemplo, só que ao fazer o casting, perdemos completamente o valor.

```java
public class ConversaoLongToInt {
  public static void main(String[] args) {
    long myLongValue = 9600000000L;
    int myIntValue = (int) myLongValue;
    System.out.println("myLongValue = " + myLongValue);
    System.out.println("myIntValue = " + myIntValue);
  }
}
```

Saída no terminal:

```shell
myLongValue = 9600000000
myIntValue = 1010065408
```

Ao fazer o casting, não foi possível armazenar todo o valor da variável `long` no `int`. Parte dos bits foram perdidos.
Então, tome muito cuidado ao fazer esse tipo de conversão.

Ao tentar converter um tipo "maior" para um tipo "menor", como de long para int, podemos fazer ou de forma implícita, ou de forma explícita.

De forma implícita:

```java
public class ConversaoLongToInt {
  public static void main(String[] args) {
    int myIntValue2 = 101234;
    long myLongValue2 = myIntValue;
    System.out.println("myLongValue = " + myLongValue2);
    System.out.println("myIntValue = " + myIntValue2);
  }
}
```

De forma explícita:

```java
public class ConversaoLongToInt {
  public static void main(String[] args) {
    int myIntValue2 = 101234;
    long myLongValue2 = (long) myIntValue;
    System.out.println("myLongValue = " + myLongValue2);
    System.out.println("myIntValue = " + myIntValue2);
  }
}
```

Convertendo `double` para `float`.

Será que dá certo?

- double = 64 bits
- float = 32 bits

```java
public class ConversaoDoubleToFloat {
  public static void main(String[] args) {
    double massaAsDouble = 34.5;
    float massaAsFloat = massaAsDouble;

    System.out.println("massaAsDouble = " + massaAsDouble);
    System.out.println("massaAsFloat = " + massaAsFloat);
  }
}
```

Fazendo um casting forçado, por risco próprio.

```java
public class ConversaoDoubleToFloat {
  public static void main(String[] args) {
    double massaAsDouble = 34.5;
    float massaAsFloat = (float) massaAsDouble;

    System.out.println("massaAsDouble = " + massaAsDouble);
    System.out.println("massaAsFloat = " + massaAsFloat);
  }
}
```