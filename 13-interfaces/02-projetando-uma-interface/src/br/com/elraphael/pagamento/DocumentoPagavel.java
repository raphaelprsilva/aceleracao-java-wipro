package br.com.elraphael.pagamento;

public interface DocumentoPagavel {
  public abstract double getValorTotal();
  public abstract Beneficiario getBeneficiario();
}
