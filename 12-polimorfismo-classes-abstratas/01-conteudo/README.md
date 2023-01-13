# Conteúdo

## Upcasting de referências

Vamos ver o exemplo abaixo:

Nele, temos dois objetos instaciados. Um da classe `Conta` e outro da classe `ContaEspecial`.

Agora repare que fizemos um `Upcasting` da referência `ContaEspecial` para `Conta`.

O objeto `contaEspecial` passará a ser entendido como um objeto do tipo `Conta`, mas ainda será do tipo `ContaEspecial`.

Ou seja, a referência `ContaEspecial` aponta para o mesmo objeto que a referência `Conta`.

```java
public class Main {
  public static void main(String[] args) {
    Titular raphael = new Titular("Raphael", "11122233344");
    Conta conta1 = new Conta(raphael, 555, 123);
    ContaEspecial contaEspecial = new ContaEspecial(raphael, 555, 123, 10);

    conta1.depositar(100);

    contaEspecial.depositar(150);

    // fazendo upcasting explícito, ou seja, transformando uma conta especial em uma conta
    // a variável conta será enxergada como uma conta normal, mas o objeto é uma conta especial
    Conta conta = (Conta) contaEspecial;

    System.out.println(contaEspecial.getClass().getName()); // br.com.elraphael.banco.ContaEspecial
    System.out.println(conta.getClass().getName()); // br.com.elraphael.banco.ContaEspecial

    System.out.println(contaEspecial == conta); // true
  }
}
```

Entenda o `Upcasting` como uma forma de converter um objeto de uma classe para outra.

