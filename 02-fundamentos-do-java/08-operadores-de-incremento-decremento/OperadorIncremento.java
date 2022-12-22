public class OperadorIncremento {
  public static void main(String[] args) {
    int totalDeExerciciosFeitos = 5;

    /*
      Suponha que você fez mais um exercício, ou seja, você
      precisa incrementar sua variável.
      Para isso, temos 3 possibilidades
     */

    // 1ª possibilidade
    // totalDeExerciciosFeitos = totalDeExerciciosFeitos + 1;

    // 2ª possibilidade
    // totalDeExerciciosFeitos += 1;

    // 3ª possibilidade (nosso foco)
    // totalDeExerciciosFeitos++;

    int novoTotalDeExerciciosFeitos = totalDeExerciciosFeitos++;

    System.out.println("Total de Exercícios feitos: " + totalDeExerciciosFeitos);
    System.out.println("Novo Total de Exercícios feitos: " + novoTotalDeExerciciosFeitos);
  }
}