# 🔣 Recebendo Entrada de dados

É possível armazenar dados inputados pelo usuário através do terminal.

Para isso, vamos utilizar uma classe especial, a `Scanner`.

Não vamos entrar a fundo o que são classes e métodos. No momento, é importante saber que é possível obter dados do usuário pelo terminal.

```java
import java.util.Scanner;

class EntradaDeDados {
    public static void main(String[ ] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite seu nome:");

        String nome = entradaUsuario.nextLine();
        System.out.printf("Oi %s, seja bem-vindo!", nome);
    }
}
```

Vamos ver um exemplo de cálculo de Indíce de Massa Corporal:

```java
import java.util.Scanner;

public class IndiceMassaCorporal {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Digite sua massa (kg): ");
    float userBodyMass = userInput.nextFloat();

    System.out.print("Digite sua altura (metros): ");
    float userHeight = userInput.nextFloat();

    float BMI = userBodyMass / (userHeight * userHeight);
    System.out.printf("Seu IMC é: %.2f%n", BMI);
  }
}
```