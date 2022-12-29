# Métodos que alteram o estado de objeto recebido como parâmetro

Vamos ver agora, o comportamento quando passamos um objeto como parâmetro de um método.

Vamos passar um objeto do tipo `Produto` como parâmetro para o método `definirPrecoVenda`.

```java
public class Main {
  public static void main(String[] args) {
    ServicoPrecificacao servicoPrecificacao = new ServicoPrecificacao();
    Produto novoProduto = new Produto();

    novoProduto.precoCusto = 100;

    //                                    \/\/\/\/\/
    servicoPrecificacao.definirPrecoVenda(novoProduto, 20);

    System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
  }
}
```

Quando fazemos isso, nós estamos passando a referência do objeto para o método. Não é criado outro obejto ou uma cópia, quando o método é invocado.

Por isso, o atributo `precoVenda` do objeto `novoProduto` é alterado.