# Operadores de Comparação

Operadores de comparação são:

- Maior que (`>`)
- Maior ou igual que (`>=`)
- Menor que (`<`)
- Menor ou igual que (`<=`)

No exemplo abaixo utilizamos uma maneira simples de usar operadores de comparação.

```java
public class OperadoresDeComparacao {
  public static void main(String[] args) {
    int quantidadeAtual = 100;
    int quantidadeMaximaPermitida = 75;

    boolean entradaPermitida = quantidadeAtual <= quantidadeMaximaPermitida;
    System.out.printf("entrada permitida? %b%n", entradaPermitida);
  }
}
```
