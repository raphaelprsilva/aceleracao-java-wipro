# Curto Circuito De Operadores Lógicos

Vamos ver esse exemplo:

```java
import java.util.Scanner;

public class AnosBissextos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um ano (AAAA): ");
    int userInputYear = input.nextInt();

    boolean isMultipleOf400 = (userInputYear % 400) == 0;
    boolean isMultipleOf4 = (userInputYear % 4) == 0;
    boolean isNotMultipleOf100 = (userInputYear % 100) == 0;
    boolean isLeapYear = isMultipleOf400 || (isMultipleOf4 && isNotMultipleOf100);
    String message = isLeapYear ? "É um ano bissexto!" : "Não é um ano bissexto!";

    System.out.println(message);
  }
}
```

Se repararmos na variável `isLeapYear`, temos que se `isMultipleOf400` for `false`, o restante da operação (no caso `(isMultipleOf4 && isNotMultipleOf100)`) não é avaliado pelo Java.

