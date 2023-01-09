package br.com.elraphael.financeiro;

public class ContaPagar {
  private String dataVencimento;
  private String descricao;
  private double valor;
  private boolean pago;
  private Fornecedor fornecedor;

  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public boolean isPago() {
    return pago;
  }

  private boolean isPendente() {
    return !isPago();
  }

  public void setFornecedor(Fornecedor fornecedor) {
    this.fornecedor = fornecedor;
  }

  public Fornecedor getFornecedor() {
    return fornecedor;
  }

  void pagar() {
    if (isPago()) {
      throw new IllegalStateException("Não é possível pagar uma conta já paga.");
    }
    this.pago = true;
  }

  public void cancelarPagamento() {
    if (isPendente()) {
      throw new RuntimeException("Conta já está pendente de pagamento");
    }
    this.pago = false;
  }
}
