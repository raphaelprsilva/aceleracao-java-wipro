# A palavra reservada `this`

Imagine que nós temos uma classe chamada `Produto` e nela um método `alterarPrecoCusto`.

O método `alterarPrecoCusto` tem um argumento que será o novo valor do preço de custo (`precoCusto`).

Se eu quiser alterar o valor, basta fazer conforme o código e estará tudo certo?

Veja o código abaixo:

```java
public class Produto {
  double precoCusto;
  double precoVenda;

  void alterarPrecoCusto(double precoCusto) {
    // será que isso está certo?
    precoCusto = precoCusto;
  }
}
```

Será que o java é suficientemente inteligente para saber qual é o atributo da classe e qual é o argumento do método?

Não, ele não é. hehhe

### 1ª Solução

Alterar o nome do argumento do método.

```java
public class Produto {
  double precoCusto;
  double precoVenda;

  void alterarPrecoCusto(double novoPrecoCusto) {
    precoCusto = novoPrecoCusto;
  }
}
```

### 2ª Solução

Adicionando a palavra-chave `this`. Ela faz referência ao atributo da classe que foi instanciada.

```java
public class Produto {
  double precoCusto;
  double precoVenda;

  void alterarPrecoCusto(double precoCusto) {
    this.precoCusto = novoPrecoCusto;
  }
}
```