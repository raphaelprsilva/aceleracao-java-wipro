# Método Estático Acessando um Membro de Instância

Imagine um cenário onde nós precisamos criar um método estático para calcular o preço total de um produto.

Vamos pensar em 3 cenários.

### 1º cenário

No primeiro cenário fizemos algo não recomendado. Criamos um método de classe que recebe um atributo de instância.

Não é algo legal de se fazer.

```java
public class Produto {
  static double precoEmbalagem;

  double precoCusto;
  double precoVenda;
  
  // não recomendado
  static double calcularCustosTotais() {
    return this.precoCusto + Produto.precoEmbalagem;
  }
}
```

### 2º cenário

No segundo cenário fizemos algo que é uma possibilidade viável. Criamos um método de instância que recebe um atributo de instância.

```java
public class Produto {
  static double precoEmbalagem;

  double precoCusto;
  double precoVenda;
  
  // alternativa viável
  double calcularCustosTotais() {
    return this.precoCusto + Produto.precoEmbalagem;
  }
}
```

### 3º cenário

No terceiro cenário fizemos algo que é uma alternativa viável.

Criamos um método de classe que recebe como parâmetro, um objeto, de maneira que não
precisamos acessar o atributo de instância diretamente na classe.

```java
public class Produto {
  static double precoEmbalagem;

  double precoCusto;
  double precoVenda;
  
  // alternativa viável
  static double calcularCustosTotais(Produto produto) {
    return produto.precoCusto + Produto.precoEmbalagem;
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    Produto novoProduto = new Produto();

    novoProduto.precoCusto = 100;
    Produto.calcularCustosTotais(novoProduto);
  }
}
```