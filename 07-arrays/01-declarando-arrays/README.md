# Declarando e Inicializando Arrays

Imagina que você precisa armazenar em um programa:

- Uma lista de notas de alunos;
- Uma lista de professores;
- Uma lista matérias;

Seria contraintuitivo que, para cada aluno, professor ou matéria, nós declarássemos variáveis e armazenássemos cada um em sua respectiva variável.

Exemplo ruim:

```java
public class Main {
  public static void main(String[] args) {
    int notaAluno1 = 12;
    int notaAluno2 = 7;
    // e assim por diante...
  }
}
```

É para casos como este que os arrays são úteis. Eles armazenam vários valores do mesmo tipo.

> Arrays são objetos!

Então, vamos ver um exemplo de como se declara um array.

```java
public class Main {
  public static void main(String[] args) {
    // 1 - declarando um array "notas" do tipo int com capacidade de 5 elementos
    // int[] notas = new int[5];

    // 2 - declarando um array "notas" com valores já na inicialização
    // int[] notas = new int[]{ 10, 23, 3, 15, 20 };

    // 3 - outra maneira de inicializar um array na declaração
    int[] notas = { 10, 23, 3, 15, 20 };
  }
}
```