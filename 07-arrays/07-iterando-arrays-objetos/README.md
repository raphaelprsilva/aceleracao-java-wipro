# Iterando Arrays de Objetos


Vamos usar as duas classes, uma chamada `Turma` e outra chamada `Aluno` para fazer iterações sobre elas.

```java
public class Aluno {
  String nome;
  int nota;
}
```

```java
public class Turma {
  String identificacao;
  String nomeProfessora;
  // aqui está o pulo do gato
  Aluno[] alunos;
}
```
Iterando sobre os objetos.

```java
public class Main {
  public static void main(String[] args) {
    Turma turmaA = new Turma();
    turmaA.identificacao = "Jardim A";
    turmaA.nomeProfessora = "Fulana de Tal";
    turmaA.alunos = new Aluno[3]; // aqui indicamos que o array terá 3 alunos

    // Primeira maneira
    turmaA.alunos[0] = new Aluno();
    turmaA.alunos[0].nome = "Marcelo";
    turmaA.alunos[0].idade = 6;

    // Segunda maneira
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Maria";
    aluno1.idade = 5;

    turmaA.alunos[1] = aluno1;

    // foco aqui
    for (int index = 0; index < turmaA.alunos.length; index += 1) {
      Aluno alunoAtual = turmaA.alunos[index];
      if (alunoAtual != null) {
        System.out.printf("%d - %s (%d anos)%n", index, alunoAtual.nome, alunoAtual.idade);
      } else {
        System.out.printf("%d - vago%n", index);
      }
    }
  }
}
```