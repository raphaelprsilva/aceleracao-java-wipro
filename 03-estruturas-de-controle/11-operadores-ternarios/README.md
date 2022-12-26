# Operador Ternário

O operador ternário, é uma maneira de escrever uma expressão condicional.

O exemplo abaixo é uma maneira "tradicional" de escrever uma estrutura condicional.
Vamos refatorá-lo usando um operador ternário.

```java
public class CalculadoraImpostos {
  public static void main(String[] args) {
    char tipoNotaFiscal = 'P';
    double totalFaturado = 1500.34;

    double valorImpostos;

    if (tipoNotaFiscal == 'S') {
      valorImpostos = totalFaturado * 0.23;
    } else {
      valorImpostos = totalFaturado * 0.34;
    }

    System.out.printf("Total Faturado: R$%.2f%n", totalFaturado);
    System.out.printf("Valor dos Impostos: R$%.2f%n", valorImpostos);
  }
}
```

Refatorando:

```java
public class CalculadoraImpostos {
  public static void main(String[] args) {
    char tipoNotaFiscal = 'P';
    double totalFaturado = 1500.34;

    double valorImpostos = tipoNotaFiscal == 'S' ? (totalFaturado * 0.23) : (totalFaturado * 0.34);

    System.out.printf("Total Faturado: R$%.2f%n", totalFaturado);
    System.out.printf("Valor dos Impostos: R$%.2f%n", valorImpostos);
  }
}
```

É possível inserir um ternário dentro de ternário. Mas devemos ficar atento, pois a legibilidade pode ser comprometida.
