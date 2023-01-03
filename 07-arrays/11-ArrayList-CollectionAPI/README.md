# Um pouco de ArrayList (Collections API)

Imagine que temos esse cenário:

- Um array de strings de duas posições que contém o nome de alunos
- Um laço que imprime um nome de alunos

```java
public class Main {
  public static void main(String[] args) {
    String[] alunos = new String[2];
    alunos[0] = "João";
    alunos[1] = "Margareth";

    for (int index = 0; index < alunos.length; index++) {
      String aluno = alunos[index];
      System.out.println(aluno);
    }
  }
}
```

A partir disso, vamos refatorar o código para usar `ArrayList`.

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // antes com arrays
    // String[] alunos = new String[2];

    // depois com ArrayList
    ArrayList<String> alunos = new ArrayList<>();

    // antes adicionando elementos ao array
    // alunos[0] = "João";
    // alunos[1] = "Margareth";

    // depois adicionando elementos ao ArrayList
    alunos.add("João");
    alunos.add("Margareth");

    // antes era -------------- alunos.length
    for (int index = 0; index < alunos.size(); index++) {
      // antes era - alunos[index]
      String aluno = alunos.get(index);
      System.out.println(aluno);
    }
  }
}
```

Pontos importantes:

- Não é necessário especificar quantos elementos terá o `ArrayList` na sua inicialização;
- O `ArrayList` é um wrapper de arrays. Ele abstrai muita coisa e facilita nossa vida;
- O `ArrayList` não funciona com tipos primitivos:
  - **Não dá certo**: `ArrayList<int> numeros = new ArrayList<>();`;
  - **Dá certo**: `ArrayList<Integer> numeros = new ArrayList<>();`;
- Use `ArrayList` quando você precisar adicionar e remover elementos de um array de maneira fácil;
- Quando for algo mais simples, use arrays normais;