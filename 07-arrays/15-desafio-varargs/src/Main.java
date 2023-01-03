public class Main {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    double media = calculadora.calcularMedia(2.0, 2.0, 4.0);
    calculadora.imprimeResultado(media);
  }
}
