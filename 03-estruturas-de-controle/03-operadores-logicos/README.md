# Operadores Lógicos

Os operadores lógicos são muito importantes na programação.

No Java, temos os operadores:

- `E` - Representado por (`&&`)
- `OU` - Representado por (`||`)

A lógica a ser utilizada quando usamos operadores lógicos é:

- `true` `||` `false` = `true`
- `false` `||` `true` = `true`
- `true` `||` `true` = `true`
- `false` `||` `false` = `false`
- `true` `&&` `false` = `false`
- `false` `&&` `true` = `false`
- `true` `&&` `true` = `true`
- `false` `&&` `false` = `false`

Exemplo:

```java
import java.util.Scanner;

public class ExameCortisol {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o nível do seu cortisol: ");
    double userCortisol = input.nextDouble();

    double minLevelIdealCortisol = 6;
    double maxLevelIdealCortisol = 18.4;

    boolean isUserCortisolIdeal = userCortisol >= minLevelIdealCortisol && userCortisol <= maxLevelIdealCortisol;
    String message = isUserCortisolIdeal ? "dentro dos limites aceitáveis" : "fora dos limites aceitáveis";
    System.out.printf("O seu cortisol está %s%n", message);
  }
}
```