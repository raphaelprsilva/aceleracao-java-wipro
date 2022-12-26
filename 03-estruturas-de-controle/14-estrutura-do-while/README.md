# Estrutura de Repetição `do while`

- É uma estrutura bastante semelhante à `while`, mas a grande diferença é que o loop é executado pelo menos uma vez.

Sintaxe básica:

```
do {
  // faça algo aqui
  // será executado pelo menos uma vez
} while (condição) {
  // faça algo aqui enquanto a condição for verdadeira
}
```

Exemplo prático:

```java
import java.util.Scanner;

public class BilhetePremiado {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int quantidadeDeNumerosJogo = 0;
    int minimoPermitido = 6;
    int maximoPermitido = 15;

    do {
      System.out.print("Digite a quantidade de números que deseja marcar no jogo: ");
      quantidadeDeNumerosJogo = entrada.nextInt();
    } while (quantidadeDeNumerosJogo < minimoPermitido || quantidadeDeNumerosJogo > maximoPermitido);

    int numeroAtual = 1;
    String numerosEscolhidos = "";

    do {
      System.out.printf("Número %d/%d: ", numeroAtual, quantidadeDeNumerosJogo);
      int numeroEscolhido = entrada.nextInt();
      numerosEscolhidos += numeroEscolhido + " ";
      numeroAtual += 1;
    } while (numeroAtual <= quantidadeDeNumerosJogo);

    System.out.printf("Números escolhidos: %s%n", numerosEscolhidos);
  }
}
```