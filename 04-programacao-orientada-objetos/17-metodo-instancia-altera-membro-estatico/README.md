# Métodos de instância que alteram atributo estático

Temos a nossa classe `Produto` e desejamos através de um método de classe, alterar o atributo estático `precoEmbalagem`.

> Métodos de classe percentem à classe e não os objetos instanciados.
> Também utilizamos a palavra reservada `static` no método estático.
> Use métodos estáticos apenas quando necessário.

Vamos ver uma maneira de fazer isso:

```java
public class Produto {
  // variável da classe e não dos obejtos
  static double precoEmbalagem = 10.25;

  double precoCusto;
  double precoVenda;
  
  static void alterarPrecoEmbalagem(double novoPreco) {
    // maneira correta de alterar
    Produto.precoEmbalagem = novoPreco;

    // não faça isso, pois você estará tentando acessar um atributo estático através de uma
    // referência de instância
    // this.precoEmbalagem = novoPreco;
  }
  
  static void imprimirCustoEmbalagem() {
    System.out.printf("Preço embalagem: %.2f%n", precoEmbalagem);
  }

  // ...
}
```

Então, se eu criar alguns objetos do tipo `Produto`, o atributo `precoEmbalagem` será o mesmo.

```java
public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();
    Produto produto3 = new Produto();
    
    // alteramos assim
    Produto.alterarPrecoEmbalagem(11.14);

    produto1.imprimirCustoEmbalagem(); // 11.14
    produto2.imprimirCustoEmbalagem(); // 11.14
    produto3.imprimirCustoEmbalagem(); // 11.14
  }
}
```