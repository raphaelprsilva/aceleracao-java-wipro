public class Holerite {
  Funcionario funcionario;
  double valorTotalHorasNormaisTrabalhadas;
  double valorTotalHorasExtrasTrabalhadas;
  double valorDoAdicionalFilhos;

  void imprimirDetalhesHolerite() {
    System.out.println("--------------Holerite--------------");
    System.out.printf("Nome Funcionário: %s%n", funcionario.nome);
    System.out.printf("Valor Horas Normais Trabalhadas: %.2f%n", valorTotalHorasNormaisTrabalhadas);
    System.out.printf("Valor Horas Extras Trabalhadas: %.2f%n", valorTotalHorasExtrasTrabalhadas);
    System.out.printf("Valor Adicional filhos: %.2f%n", valorDoAdicionalFilhos);
    System.out.printf("Valor total a receber: %.2f%n", calcularValorTotal());
  }

  double calcularValorTotal() {
    double valorTotal = valorTotalHorasExtrasTrabalhadas + valorTotalHorasNormaisTrabalhadas + valorDoAdicionalFilhos;
    return valorTotal;
  }
}
