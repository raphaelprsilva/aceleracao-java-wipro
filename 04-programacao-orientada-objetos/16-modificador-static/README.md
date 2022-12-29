# Atributos de classe com o modificador `static`

A palavra `static` é usada no contexto onde desejamos definir um atributo da classe como sendo global.
Isso significa que, independentemente de quantos objetos forem instanciados, o seu valor permanecerá o mesmo.

Imagine que temos uma classe `Produto`, e temos um atributo chamado `precoEmbalagem`, e esse preço ele não varia de acordo
com o produto, ou seja, é constante. Vamos ver como fica a implementação:

```java
public class Produto {
  static double precoEmbalagem = 10.25;
  double precoCusto;
  double precoVenda;
  
  void imprimirCustoEmbalagem() {
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
    
    // acessamos assim
    // Produto.precoEmbalagem

    produto1.imprimirCustoEmbalagem(); // 10.25
    produto2.imprimirCustoEmbalagem(); // 10.25
    produto3.imprimirCustoEmbalagem(); // 10.25
  }
}
```