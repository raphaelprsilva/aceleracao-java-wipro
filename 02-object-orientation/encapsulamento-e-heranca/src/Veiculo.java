public class Veiculo {
  private String placa;
  private String motorista;
  private String cor;

  public Veiculo(String placa, String motorista, String cor) {
    this.placa = placa;
    this.motorista = motorista;
    this.cor = cor;
  }

  public String getPlaca() {
    return this.placa;
  }

  public String getMotorista() {
    return this.motorista;
  }

  public String getCor() {
    return this.cor;
  }
}
