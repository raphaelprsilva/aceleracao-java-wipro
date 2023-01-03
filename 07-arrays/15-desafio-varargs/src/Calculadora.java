public class Calculadora {
  double calcularMedia(double valor1, double valor2, double... numeros) {

    double somaValores = valor1 + valor2;
    int quantidadeDeValoresObrigatorios = 2;
    int quantidadeTotalDeNumeros = quantidadeDeValoresObrigatorios + numeros.length;

    for (double numero : numeros) {
      somaValores += numero;
    }

    return somaValores / quantidadeTotalDeNumeros;
  }

  void imprimeResultado(double media) {
    System.out.printf("A média é: %.2f%n", media);
  }
}
