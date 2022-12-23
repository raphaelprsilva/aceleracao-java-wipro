# ⚡ Sequências de Escape

Imagine o cenário:

```java
public class SeqDeEscape {
  public static void main(String[] args) {
    System.out.println("Oi "Joãozinho"");
  }
}
```

O código acima dá erro de compilação, pois o Java não processa corretamente o fato de você querer colocar uma aspas duplas no nome.

Isso significa que não o entendimento de onde termina e começa a string.

Queremos que as aspas duplas delimite o nome. Para isso, vamos utilizar sequências de escape.

Ela é utilizada para quebras de linha, indicar aspas duplas numa string, e assim por diante.

```java
public class SeqDeEscape {
  public static void main(String[] args) {
    System.out.println("Oi \"Joãozinho\"");
  }
}
```

Vamos ver outras sequências de escapes.

- Quebra de linha - `\n`

```java
public class SeqDeEscape {
  public static void main(String[] args) {
    System.out.println("Nome: \n\"Joãozinho\"");
    System.out.println("C:\\Windows"); // "C:\Windows"
  }
}
```