public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    carro1.fabricante = "Chevrolet";
    carro1.modelo = "Chevette Tubarão";
    carro1.cor = "Prata";
    carro1.anoFabricacao = 1975;

    carro1.proprietario = new Proprietario();
    carro1.proprietario.nome = "Raphael";
    carro1.proprietario.cpf = "111.111.111-23";
    carro1.proprietario.idade = 19;
  }
}
