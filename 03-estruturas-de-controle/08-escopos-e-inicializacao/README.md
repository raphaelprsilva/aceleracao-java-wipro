# Escopos e Inicialização de Variáveis

Vamos ver o escopo de variáveis com um exemplo.

Imagine que você escreveu um programa que calcula o preço de uma compra que você fez.
O cálculo com o resultado, deve verificar se vai ter frete ou não. Se tiver, o valor do frete
deve ser informado e adicionado ao valor final da compra, caso contrário, o resultado terá apenas o preço do produto.

```java
import java.util.Scanner;

public class CalculaPrecoProduto {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Qual o preço do produto? ");
    float productPrice = input.nextFloat();

    System.out.print("Vai ter frete? ('true' ou 'false')");
    boolean hasShipping = input.nextBoolean();
    
    if (hasShipping) {
      System.out.print("Valor do Frete: ");
      float shipping = input.nextFloat();
    }
    
    float finalPrice = productPrice + shipping;
    System.out.printf("O preço final do produto é: %.2f%n", finalPrice);
  }
}
```

Ao rodar o código acima, teremos um erro nessa linha `float finalPrice = productPrice + shipping;`.
Ele informa que não reconhece a variável `shipping`. Isso acontece, pois, essa variável só existe no escopo do `if`.

Como resolver o problema?

Podemos declarar a variável fora do escopo do if, e atribuir o valor do frete, caso ele exista.

```java
import java.util.Scanner;

public class CalculaPrecoProduto {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Qual o preço do produto? ");
    float productPrice = input.nextFloat();

    System.out.print("Vai ter frete? ('true' ou 'false'): ");
    boolean hasShipping = input.nextBoolean();

    float shipping = 0;

    if (hasShipping) {
      System.out.print("Valor do Frete: ");
      shipping = input.nextFloat();
    }

    float finalPrice = productPrice + shipping;
    System.out.printf("O preço final do produto é: %.2f%n", finalPrice);
  }
}
```
