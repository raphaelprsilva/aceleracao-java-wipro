public class Avaliacao {
  public void calcularIMC(double peso, double altura) {
    double IMC = peso / Math.pow(altura, 2);
    System.out.println("O seu IMC é " + IMC);
  }
}
