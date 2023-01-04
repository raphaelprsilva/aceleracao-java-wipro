# Criando e chamando Construtores

- Toda classe possui um `Construtor`;
- Quando instanciamos um novo objeto, estamos chamando o construtor da classe;
- Ou seja, o `new` invoca o consutrutor da classe;
- Quando não declaramos um construtor de maneira explícita, o Java, por debaixo dos panos, invoca o construtor-padrão da
  classe;
- Imagine que a assinatura de um construtor é parecida com a de um método, mas ele não retorna nada;
- O construtor deve ter o mesmo nome da classe, diferente de outras linguagens de programação;
- Você pode inserir qualquer lógica no construtor, quando desejar que ao instanciar o objeto, ele tenha determinado tipo
  de comportamento;

Vamos ver um exemplo:

```java
public class Produto {
  Produto() {
    System.out.println("Construindo um produto");
  }
}

public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();
    // você verá a mensagem "Construindo um produto" duas vezes ao rodar o programa
  }
}
```

## Passando parâmetros para o construtor

Imagine que toda vez que instanciarmos um objeto do tipo `Produto`, este deve ter um `nome` e `quantidade em estoque`.

Como faríamos isso?

Vamos incrementar nosso código:

```java
public class Produto {
  String nome;
  int quantidadeEstoque;

  Produto(String nome, int quantidadeEstoque) {
    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
  }
}

public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto("Notebook", 10);
    System.out.println(produto1.nome);
    System.out.println(produto1.quantidadeEstoque);
  }
}
```

E se por exemplo, eu não precisasse informar durante a instanciação de um objeto, a quantiadde inicial em estoque?

Como faríamos?

```java
public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  String nome;
  int quantidadeEstoque;

  Produto(String nome) {
    this.nome = nome;
    this.quantidadeEstoque = QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE;
  }
}

public class Main {
  public static void main(String[] args) {
    // veja a mudança ao instanciar o objeto do tipo Produto
    Produto produto1 = new Produto("Notebook");
    System.out.println(produto1.nome);
    System.out.println(produto1.quantidadeEstoque);
  }
}
```

## Sobrecarga de Construtores

Imagine outro cenário. E se eu quisesse, ao instanciar um objeto do tipo `Produto`, poder às vezes informar a quantidade em estoque
e às vezes não informar, sem que isso seja algo obrigatório.

É aí que entra a sobrecarga de construtores.

Vamos ver um exemplo:

```java
public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  String nome;
  int quantidadeEstoque;

  // simula um construtor padrão da classe
  Produto() {
    this.nome = "Sem nome";
    this.quantidadeEstoque = QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE;
  }

  Produto(String nome) {
    this.nome = nome;
    this.quantidadeEstoque = QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE;
  }

  Produto(String nome, int quantidadeEstoque) {
    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
  }
}

public class Main {
  public static void main(String[] args) {
    // intanciando um objeto com um atributo
    Produto produto1 = new Produto("Notebook");
    System.out.println(produto1.nome);
    System.out.println(produto1.quantidadeEstoque);

    // intanciando um objeto com dois atributos
    Produto produto2 = new Produto("Teclado Mecânico", 20);
    System.out.println(produto2.nome);
    System.out.println(produto2.quantidadeEstoque);
  }
}
```

## Boas Práticas - Valide argumentos de construtores também

Dentro do nosso cenário, alguém pode querer instanciar um objeto `Produto` da seguinte maneira:

- `Produto produto = new Produto(null, -23)`;
  - Atributo `name` = `null`;
  - Atributo `quantidadeEstoque` = `-23`;

Isso é meio inconsistente, não? Até o momento, da maneira como construímos nossas classes, isso é algo compilável. E como validar os atributos ao instanciar um novo objeto?

```java
import java.util.Objects;

public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  String nome;
  int quantidadeEstoque;

  // simula um construtor padrão da classe
  Produto() {
    this.nome = "Sem nome";
    this.quantidadeEstoque = QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE;
  }

  Produto(String nome) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");
    this.nome = nome;
    this.quantidadeEstoque = QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE;
  }

  Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");

    if (this.quantidadeEstoque < 0) {
      throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
  }
}
```

## Encadeamento de chamadas de construtores

Podemos encadear as chamadas de construtores, ou seja, eu posso chamar um construtor dentro de outro.

Vamos ver um exemplo?

```java
import java.util.Objects;

public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  String nome;
  int quantidadeEstoque;

  // simula um construtor padrão da classe
  Produto() {
    // antes do this, não posso colocar nenhuma instrução, pois, é a fase de construção do objeto
    this("Sem nome");

    // daqui para baixo posso colocar qualquer instrução
  }

  Produto(String nome) {
    // chamando o construtor de baixo. repare que ele recebe dois parâmetros
    this(nome, QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE);
  }

  Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");

    if (this.quantidadeEstoque < 0) {
      throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
  }
}
```

## Mofificador `final` em atributos de instância

Imagine no nosso contexto da classe `Produto` que cada produto agora deve ter um código. Esse código não pode ser modificado
após a instanciação de um novo produto. Como fazemos isso?

- Devemos usar o modificador de acesso `final`;

```java
import java.util.Objects;

public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  // inseri o atributo aqui. Ele não poderá ser alterado
  final String codigo;
  String nome;
  int quantidadeEstoque;

  Produto() {
    this("Sem nome");
  }

  Produto(String nome) {
    this(nome, QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE);
  }

  Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");

    if (this.quantidadeEstoque < 0) {
      throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
    // atribui um valor ao código
    this.codigo = "ASD123";
  }
}
```

Mas da forma como fizemos, todo produto terá o mesmo código "ASD123", e isso não é algo viável.

Como geramos então um código único e que dificilmente irá se repetir? Usando a classe `UUID`.

Veja abaixo:

```java
import java.util.Objects;
import java.util.UUID;

public class Produto {
  static final int QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE = 50;

  final String codigo;
  String nome;
  int quantidadeEstoque;

  Produto() {
    this("Sem nome");
  }

  Produto(String nome) {
    this(nome, QUANTIDADE_PADRAO_INICIAL_EM_ESTOQUE);
  }

  Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "O nome do produto é obrigatório.");

    if (this.quantidadeEstoque < 0) {
      throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
    this.codigo = UUID.randomUUID().toString(); // repare aqui
  }

  void imprimirInformacoes() {
    System.out.printf("Nome: %s%n", this.nome);
    System.out.printf("Quantidade Estoque: %d%n", this.quantidadeEstoque);
    System.out.printf("Código Produto: %s%n", this.codigo);
  }
}
```