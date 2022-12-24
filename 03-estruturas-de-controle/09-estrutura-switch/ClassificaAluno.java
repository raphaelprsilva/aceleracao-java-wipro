public class ClassificaAluno {
  public static void main(String[] args) {
    int studentGrade = 9;

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