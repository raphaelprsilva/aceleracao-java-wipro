# Switch Expressions

A partir do Java 14 foi introduzida uma mudança no `switch`. São os `arrow labels`.

Com ele, não precisamos mais utilizar o `break`.

Vamos refatorar esse código:

```java
public class StoreWorking {
  public static void main(String[] args) {
    String weekDay = "qua";

    String message;
    
    switch (weekDay) {
      case "seg":
        message = "Fechado";
        break;
      case "ter":
      case "qua":
      case "qui":
      case "sex":
        message = "Aberto das 8:00 às 22:00";
        break;
      case "sab":
      case "dom":
        message = "Aberto das 8:00 às 16:00";
        break;
      default:
        message = "Opção inválida";
    }

    System.out.printf("Mensagem: %s%n", message);
  }
}
```

Para o switch com `arrow labels`.

```java
public class StoreWorking {
  public static void main(String[] args) {
    String weekDay = "qua";

    String message;
    
    switch (weekDay) {
      case "seg", "ter", "qua", "qui" -> message = "Fechado";
      case "sex" -> message = "Aberto das 8:00 às 22:00";
      case "sab", "dom" -> {
        message = "Aberto das 8:00 às 16:00";
        // posso inserir outras coisas nesse escopo
      }
      default -> message = "Opção inválida";
    }

    System.out.printf("Mensagem: %s%n", message);
  }
}
```

Viu como ficou muito legal?

Agora, vamos usar o `Switch Expressions`, ou seja, podemos atribuir o valor de um switch a uma variável.

Veja o exemplo abaixo:

```java
public class StoreWorking {
  public static void main(String[] args) {
    String weekDay = "qua";
    int month = 12;

    String message = switch (weekDay) {
      case "seg", "ter", "qua", "qui" -> {
        if (month == 12) {
          yield "Estamos abertos o dia todo";
        }
        yield "Fechado";
      }
      case "sex" -> "Aberto das 8:00 às 22:00";
      case "sab", "dom" -> "Aberto das 8:00 às 16:00";
      default -> "Opção inválida";
    };

    System.out.printf("Mensagem: %s%n", message);
  }
}
```