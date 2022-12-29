public class FolhaDePagamento {
  Holerite calcularSalario(double horasNormaisTrabalhadas, double horasExtrasTrabalhadas, ContratoTrabalho contratoTrabalho) {
    Holerite holerite = new Holerite();
    holerite.valorTotalHorasNormaisTrabalhadas = horasNormaisTrabalhadas * contratoTrabalho.valorHoraNormalTrabalhada;
    holerite.valorTotalHorasExtrasTrabalhadas = horasExtrasTrabalhadas * contratoTrabalho.valorHoraExtraTrabalhada;

    if (contratoTrabalho.temAdicionalNoSalario()) {
      holerite.valorDoAdicionalFilhos = 0.01;
      return holerite;
    }

    return holerite;
  }
}
