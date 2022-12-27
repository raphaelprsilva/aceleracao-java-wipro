public class Main {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();

    // atribuindo valores aos atributos
    meuCarro.fabricante = "Honda";
    meuCarro.modelo = "Civic";
    meuCarro.anoFabricacao = 2018;
    meuCarro.cor = "prata";

    System.out.printf("Modelo: %s%n", meuCarro.modelo);
    System.out.printf("Ano Fabricação: %s%n", meuCarro.anoFabricacao);

    Carro seuCarro;
    seuCarro = new Carro();

    seuCarro.fabricante = "Chevrolet";
    seuCarro.modelo = "Chevette Tubarão";
    seuCarro.anoFabricacao = 1975;
    seuCarro.cor = "marrom";
  }
}
