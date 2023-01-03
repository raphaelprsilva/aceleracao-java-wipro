# Arrays Multidimensionais

É possível que você já tenha visto arrays multidimensionais em outras linguagens de programação. Em Java, arrays
multidimensionais são arrays de arrays. Por exemplo, um array de arrays de inteiros é um array multidimensional de
inteiros.

Vamos ver um exemplo de array multidimensional de nomes.

No cenário abaixo, queremos construir algo semelhante à isso:

```
nomes = [
  // (0)      (1)
  ["João", "Maria"], // (0) primeira linha
  ["Pedro", "Ana"], //  (1) segunda linha
]
```

```java
public class Main {
  public static void main(String[] args) {
    String[][] nomes = new String[2][2];

    // primeira "linha"
    nomes[0][0] = "João";
    nomes[0][1] = "Maria";

    // segunda "linha"
    nomes[1][0] = "José";
    nomes[1][1] = "Ana";

    System.out.println(nomes[0][0]); // João
    System.out.println(nomes[0][1]); // Maria
    System.out.println(nomes[1][0]); // José
    System.out.println(nomes[1][1]); // Ana
  }
}
```