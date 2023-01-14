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



## O problema que o polimorfismo resolve

Vamos implementar uma classe que representa um caixa eletrônico.

```java
package br.com.elraphael.banco;

public class CaixaEletronico {
  private static final double TARIFA_TRANSFERENCIA = 10;

  public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino, double valorTransferencia) {
    System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
        valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
        contaDestino.getAgencia(), contaDestino.getNumero());

    contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
    contaDestino.depositar(valorTransferencia);
  }
}
```

Para transferir dinheiro de uma conta para a outra:

```java
import br.com.elraphael.banco.CaixaEletronico;
import br.com.elraphael.banco.Conta;
import br.com.elraphael.banco.ContaEspecial;
import br.com.elraphael.banco.Titular;

public class Main {
  public static void main(String[] args) {
    CaixaEletronico caixaEletronico = new CaixaEletronico();

    Titular raphael = new Titular("Raphael", "11122233344");
    Titular rodrigo = new Titular("Rodrigo", "19234323312");

    ContaEspecial contaRaphael = new ContaEspecial(raphael, 555, 123, 5);
    ContaEspecial contaRodrigo = new ContaEspecial(rodrigo, 322, 444, 10);

    contaRaphael.depositar(100);

    caixaEletronico.transferir(contaRaphael, contaRodrigo, 50);
    contaRaphael.imprimirDemonstrativo();
    contaRodrigo.imprimirDemonstrativo();
  }
}
```

Mas, e se eu desejasse transferir de uma conta salário para uma conta especial?

Eu poderia criar uma sobrecarga de métodos. Mas eu teria que basicamente repetir o método `transferir`
com uma assinatura diferente. O que é código duplicado e rígido.

É aí que o polimorfismo entra.

**Poli**: várias

**Morfismo**: formas

Então o nosso método `transferir` pode sair disso:

```java
package br.com.elraphael.banco;

public class CaixaEletronico {
  private static final double TARIFA_TRANSFERENCIA = 10;

  //                     ↓↓↓↓↓↓↓↓↓↓↓↓↓              ↓↓↓↓↓↓↓↓↓↓↓↓↓
  public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino, double valorTransferencia) {
    System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
        valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
        contaDestino.getAgencia(), contaDestino.getNumero());

    contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
    contaDestino.depositar(valorTransferencia);
  }
}
```

Para isso:

```java
package br.com.elraphael.banco;

public class CaixaEletronico {
  private static final double TARIFA_TRANSFERENCIA = 10;

  //                     ↓↓↓↓↓              ↓↓↓↓↓
  public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
    System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
        valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
        contaDestino.getAgencia(), contaDestino.getNumero());

    contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
    contaDestino.depositar(valorTransferencia);
  }
}
```

Isso significa que eu poderei tranferir o dinheiro, independentemente do tipo de conta, pois todas as
demais contas extendem a classe `Conta`. Ou seja, está sendo feito o upcasting implicitamente.

Então, polimorfismo pode ser usado assim.

## Downcasting de referências

O downcasting é o processo inverso do upcasting. Ou seja, é o processo de converter um objeto de uma
classe mais genérica para uma classe mais específica.

Podemos usar o instanceof para verificar se um objeto é uma instância de uma classe.

Veja o código da classe `CaixaEletronico`.
