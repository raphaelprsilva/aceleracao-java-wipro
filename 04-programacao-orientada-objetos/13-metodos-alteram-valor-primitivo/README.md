# Métodos que alteram o valor de parâmetro do tipo primitivo

Imagine que eu tenho uma classe `ServicoPrecificacao` da seguinte forma:

```java
public class ServicoPrecificaco {
  void calcularPrecoVenda(double precoCusto) {
    // adiciona 20% de margem de lucro
    precoCusto = precoCusto * 1.2;
  }
}
```

Temos um método `calcularPrecoVenda` que não retorna nada, apenas atribui à variável `precoCusto` o prórpio valor dela multiplicado por `1.2`.

Já na classe `Main`, temos:

```java
public class Main {
  public static void main(String[] args) {
    double precoCompraFornecedor = 150;

    ServicoPrecificacao servicoPrecificacao = new ServicoPrecificacao();
    
    // reparem aqui
    servicoPrecificacao.calcularPrecoVenda(precoCompraFornecedor);

    System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
  }
}
```

A pergunta que fica é:

Será que a variável `precoCompraFornecedor` será alterada quando passamos ela para o método `calcularPrecoVenda`?

A resposta é: não. Isso acontece pois as referências são diferentes. O parâmetro `precoCusto` é local apenas dentro do método.
E a variável `precoCompraFornecedor` é um tipo primitivo dentro do escopo do `main`. Quando eu passo ela para o método, eu passo
apenas o valor, e não a referência dela.