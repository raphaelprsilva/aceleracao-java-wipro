# Criando Arrays de Objetos

Imagine que estamos modelando um software de gerenciamento de alunos de escola.

Para isso, vamos ter duas classes, uma chamada `Turma` e outra chamada `Aluno`.

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
Criamos um atributo `alunos`, que representa a lista de alunos da turma.

Vamos instancias os objetos na classe `Main`.

```java
public class Main {
  public static void main(String[] args) {
    Turma turmaA = new Turma();
    turmaA.identificacao = "Jardim A";
    turmaA.nomeProfessora = "Fulana de Tal";
    turmaA.alunos = new Aluno[2]; // aqui indicamos que o array terá 2 alunos

    // Primeira maneira
    turmaA.alunos[0] = new Aluno();
    turmaA.alunos[0].nome = "Marcelo";
    turmaA.alunos[0].idade = 6;

    // Segunda maneira
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Maria";
    aluno1.idade = 5;

    turmaA.alunos[1] = aluno1;
  }
}
```