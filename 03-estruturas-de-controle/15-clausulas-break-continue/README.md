# Cláusulas `break` e `continue`

As cláusulas `break` e `continue` são utilizadas para interromper ou continuar o fluxo de um loop.

Exemplo:

```java
import java.util.Scanner;

public class PesoAeronave {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o peso máximo permitido na aeronave: ");
    int pesoMaximoAeronave = entrada.nextInt();

    int pesoTotalPassageiros = 0;
    int passageiroAtual = 1;

    while (true) {
      System.out.printf("Peso passageiro %d: ", passageiroAtual);
      int pesoPassageiroAtual = entrada.nextInt();
      pesoTotalPassageiros += pesoPassageiroAtual;

      if (pesoTotalPassageiros > pesoMaximoAeronave) {
        System.out.println("Peso máximo excedido. Informe um peso dentro dos limites.");
        continue; // poderia ser omitido se usássemos o `else`
      }

      System.out.print("Incluir próximo passageiro? (true ou false): ");
      int incluirPassageiro = entrada.nextBoolean();
      if (!incluirPassageiro) break;
      passageiroAtual += 1;
    }

    String mensagemPermissaoVoo = (pesoTotalPassageiros > pesoMaximoAeronave) ? "Não pode voar" : "Bom voo";

    System.out.println("---------------------------------------------------");
    System.out.printf("Peso máximo permitido na aeronave: %d kgs %n", pesoMaximoAeronave);
    System.out.printf("Peso total dos passageiros: %d kgs%n", pesoTotalPassageiros);
    System.out.println(mensagemPermissaoVoo);
  }
}
```