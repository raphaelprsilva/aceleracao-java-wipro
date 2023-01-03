import java.util.Arrays;

public class Cardapio {
  ItemCardapio[] itens = new ItemCardapio[0];

  void adicionarItem(ItemCardapio item) {
    ItemCardapio[] itensCopia = Arrays.copyOf(this.itens, this.itens.length + 1);
    itensCopia[itensCopia.length - 1] = item;
    this.itens = itensCopia;
  }

  void removerItem(int indice) {
    ItemCardapio[] novosItens = new ItemCardapio[this.itens.length - 1];
    System.arraycopy(this.itens, 0, novosItens, indice, novosItens.length - 1);
    System.arraycopy(this.itens, indice + 1, novosItens, indice, novosItens.length - indice);
    this.itens = novosItens;
  }

  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    for (ItemCardapio item : itens) {
      if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
        System.out.printf("Produto: %s / Preço: R$ %.2f%n", item.descricao, item.preco);
      }
    }
  }
}