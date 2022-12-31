# Usando classes Wrapper

Quase tudo no Java é um objeto. Os tipos primitivos são os únicos elementos que não são objetos.

Algumas observações:

Em tipos primitivos, ou atribuímos um valor referente ao tipo da variável que criamos, ou não inserimos nada.
Porém, inserir `null` geraria um erro.

- Não compila: `int diasParaEntrega = null`
- Compila: `int diasParaEntrega`
- Compila: `int diasParaEntrega = 10`

Vamos ver abaixo:

```java
public class Main {
  public static void main(String[] args) {
    // tipos primitivos
    int diasParaEntrega;
    long codigoParaEntrega;
    float valorFrete;
    double valorTotal;
    char tipoCliente;
    boolean compraPaga;

    // tipos não-primitivos
    String nomeCliente;
  }
}
```
Existem classes que representam os tipos primitivos? Sim, são as classes _Wrappers_.

Exemplo:

```java
public class Cliente {
  String nome;
  Integer idade;
  Double rendaMensal;
}
```

Repare que `String`, `Integer` e `Double` são classes. Isso abre os leques de possibilidades.

Vamos ver como podemos usar a classes _Wrappers_.

Iremos usar o método `valueOf` para "envelpar" o valor que o atributo `idade` vai receber.

```java
public class Main {
  public static void main(String[] args) {
    Cliente novoCliente = new Cliente();

    // repare abaixo

    // podemos passar um inteiro, mas isso é redundante, pois a propriedade já recebe
    // um inteiro
    novoCliente.idade = Integer.valueOf(23);

    // aqui temos um uso mais efetivo do método valueOf, pois passamos uma string
    novoCliente.idade = Integer.valueOf("23");

    // isso aqui gera uma exceção, pois não há como converter essa string para inteiro
    novoCliente.idade = Integer.valueOf("vinte e cinco");
  }
}
```

Então, todos os tipos primitivos possuem sua respectiva classe Wrapper.

```java
public class Main {
  public static void main(String[] args) {
    Integer diasParaEntrega;
    Long codigoParaEntrega;
    Float valorFrete;
    Double valorTotal;
    Char tipoCliente;
    Boolean compraPaga;
    String nomeCliente;
  }
}
```