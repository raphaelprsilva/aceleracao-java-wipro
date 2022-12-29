public class ContratoTrabalho {
  Funcionario funcionario;
  double valorHoraNormalTrabalhada;
  double valorHoraExtraTrabalhada;

  boolean temAdicionalNoSalario() {
    return funcionario.temMaisDeUmFilho();
  }
}
