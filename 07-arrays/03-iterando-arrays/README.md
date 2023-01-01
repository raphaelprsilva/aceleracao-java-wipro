# Iterando Arrays

Também podemos percorrer os valores de arrays e fazer qualquer tipo de operações.

Imagine que precisamos calcular a média de notas dos alunos.

1. Precisamos somar as notas;
2. Dividir pela quantidade de notas;

```java
public class Main {
  public static void main(String[] args) {
    int[] notas = { 2, 6, 4, 9, 6 };

    int somaDasNotas;
    int quantidadeDeNotas = notas.length;
    double mediaDasNotas;

    // 1ª opção - usando índices
    // for (int i = 0; i < quantidadeDeNotas; i += 1) {
    //   somaDasNotas += notas[i];
    // }
    
    // 2ª opção - sem índices
    for (int nota : notas) {
      somaDasNotas += nota;
    }

    mediaDasNotas = (double) somaDasNotas / quantidadeDeNotas;
    System.out.println(mediaDasNotas);
  }
}
```