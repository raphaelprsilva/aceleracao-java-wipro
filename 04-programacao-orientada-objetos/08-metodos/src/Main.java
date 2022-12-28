public class Main {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();
    meuCarro.anoFabricacao = 2012;
    meuCarro.precoCompra = 25000;
    meuCarro.cor = "Branco";

    Pessoa eu = new Pessoa();
    eu.nome = "Raphael";

    meuCarro.imprimirResumoDepreciacao();

    double ipvaMeuCarro = meuCarro.calcularIpva();
    System.out.printf("IPVA do meu carro: %f%n", ipvaMeuCarro);
  }
}
