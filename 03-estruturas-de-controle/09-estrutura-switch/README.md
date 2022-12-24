# Estrutura `switch`

O `switch` é um tipo de estrutura condicional. Ele é bastante utilizado quando estamos avaliando apenas uma variável para tomar uma decisão.

Vamos ver um exemplo:

```java
public class ClassificaAluno {
  public static void main(String[] args) {
    int studentGrade = 3;
    
    String gradeDescription;
    
    switch (studentGrade) {
      case 1:
        gradeDescription = "Muito ruim";
        break;
      case 2:
        gradeDescription = "Ruim";
        break;
      case 3:
        gradeDescription = "Razoável";
        break;
      case 4:
        gradeDescription = "Bom";
        break;
      case 5:
        gradeDescription = "Ótimo";
        break;
      default:
        gradeDescription = "Opção inválida";
    }

    System.out.printf("Sua nota foi: %d. Classificação: %s%n", studentGrade, gradeDescription);
  }
}
```

- Observação:
  - O `switch` não funciona com o tipo `long`.

Outro Exemplo:

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