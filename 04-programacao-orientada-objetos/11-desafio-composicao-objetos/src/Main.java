public class Main {
  public static void main(String[] args) {
    FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
    ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
    Funcionario raphael = new Funcionario();
    Holerite holerite = new Holerite();

    contratoTrabalho.valorHoraNormalTrabalhada = 20;
    contratoTrabalho.valorHoraExtraTrabalhada = 12;

    raphael.nome = "Raphael";
    raphael.quantidadeFilhos = 3;
    contratoTrabalho.funcionario = raphael;
    holerite.funcionario = raphael;

    Holerite salarioFuncionario = folhaDePagamento.calcularSalario(12, 30, contratoTrabalho);
    System.out.printf("Salarário Funcionário: %f%n", salarioFuncionario.calcularValorTotal());
    holerite.imprimirDetalhesHolerite();
  }
}
