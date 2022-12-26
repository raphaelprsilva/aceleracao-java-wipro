# Estrutura de Repetição `while`

- `while` em português, significa `enquanto`.
- Nós vamos utilizar a expressão sempre pensando: "_Enquanto a expressão ou valor for verdadeiro, faça algo_".
- Usamos a estrutura `while`, quando não sabemos de antemão, quantas repetições precisamos/desejamos.

Estrutura Básica:

```
while (condição) {
  // faça algo
  
  // No final da repetição, incrementa uma variável
}
```

Exemplo:

```java
import java.util.Scanner;

public class PesoAeronave {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o peso máximo permitido na aeronave: ");
    int pesoMaximoAeronave = entrada.nextInt();

    int passageiroAtual = 1;
    int pesoTotalPassageiros = 0;

    while (passageiroAtual <= quantidadePassageiros) {
      System.out.printf("Peso passageiro %d:", passageiroAtual);
      int pesoPassageiroAtual = entrada.nextInt();
      pesoTotalPassageiros += pesoPassageiroAtual;

      passageiroAtual += 1; // ou poderia ser passageiroAtual++
    }

    String mensagemPermissaoVoo = (pesoTotalPassageiros > pesoMaximoAeronave) ? "Não pode voar" : "Bom voo";
    System.out.println(mensagemPermissaoVoo);
  }
}
```