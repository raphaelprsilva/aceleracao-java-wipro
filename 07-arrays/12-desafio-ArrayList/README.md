# Desafio - ArrayList

Refatore o código abaixo para usar `ArrayList`, no lugar de array.

```java
public class ItemCardapio {
  String descricao;
  double preco;

  boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
    return preco >= precoMinimo && preco <= precoMaximo;
  }

  void imprimir() {
    System.out.printf("%s x R$%.2f%n", descricao, preco);
  }
}
```

```java
import java.util.Arrays;

public class Cardapio {
  ItemCardapio[] itens = new ItemCardapio[0];

  void adicionarItem(ItemCardapio item) {
    itens = Arrays.copyOf(itens, itens.length + 1);
    itens[itens.length - 1] = item;
  }

  void removerItem(int indice) {
    ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];
    System.arraycopy(itens, 0, novosItens, 0, indice);
    System.arraycopy(itens, indice + 1,
        novosItens, indice, novosItens.length - indice);
    itens = novosItens;
  }

  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    for (ItemCardapio item : itens) {
      if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
        item.imprimir();
      }
    }
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    Cardapio cardapio = new Cardapio();

    ItemCardapio item1 = new ItemCardapio();
    item1.descricao = "Rib Eye 500g";
    item1.preco = 95;

    ItemCardapio item2 = new ItemCardapio();
    item2.descricao = "Picanha 400g";
    item2.preco = 102.5;

    ItemCardapio item3 = new ItemCardapio();
    item3.descricao = "Batata frita 300g";
    item3.preco = 12;

    cardapio.adicionarItem(item1);
    cardapio.adicionarItem(item2);
    cardapio.adicionarItem(item3);

    cardapio.imprimirItensCardapio(80, 150);

    cardapio.removerItem(0);
    System.out.println("---");
    cardapio.imprimirItensCardapio(0, 150);
  }
}
```

<details>
    <summary>Resposta</summary>

```java
import java.util.ArrayList;

public class Cardapio {
  ArrayList<ItemCardapio> itens = new ArrayList<ItemCardapio>();

  void adicionarItem(ItemCardapio item) {
    itens.add(item);
  }

  void removerItem(int indice) {
    itens.remove(indice);
  }

  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    for (ItemCardapio item : itens) {
      if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
        item.imprimir();
      }
    }
  }
}
```
</details>