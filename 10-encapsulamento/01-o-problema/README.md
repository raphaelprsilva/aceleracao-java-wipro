# O problema da falta de encapsulamento

O encapsulamento é um dos pilares da orientação a objetos, e é um dos conceitos mais importantes para a criação de um código limpo e de fácil manutenção.

O encapsulamento é a técnica de esconder os detalhes de implementação de um objeto, expondo apenas uma interface de uso. Isso permite que o objeto seja usado sem que o usuário precise conhecer os detalhes de implementação.

## O problema

Vamos supor que você tenha uma classe `Conta` que representa uma conta bancária. Essa classe possui os seguintes atributos:

```java
public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
}
```

E possui os seguintes métodos:

```java
public class Conta {
    // ...
    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataAbertura;
        return dados;
    }
}
```

Agora, vamos supor que você tenha uma classe `TestaConta` que possui o seguinte método:

```java
public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.titular = "Raphael";
        minhaConta.saldo = 1000.0;
        minhaConta.saca(200.0);
        System.out.println(minhaConta.saldo);
    }
}
```

O código acima compila e funciona, mas não é um código muito bom. Por exemplo, se você quiser alterar o nome do atributo `saldo` para `saldoAtual`, você terá que alterar o código em vários lugares. E se você quiser alterar o nome do método `saca` para `retira`, você terá que alterar o código em vários lugares também.

## A solução

O encapsulamento é a solução para esse problema. Ele permite que você altere a implementação de um objeto sem que o código que o usa seja afetado. Para isso, você precisa esconder os detalhes de implementação do objeto, expondo apenas uma interface de uso.

Para esconder os detalhes de implementação, você precisa tornar os atributos privados e criar métodos públicos para acessá-los. Para tornar um atributo privado, você precisa colocar a palavra-chave `private` antes do tipo do atributo. Por exemplo:

```java
public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
}
```

Para criar métodos públicos para acessar os atributos, você precisa criar métodos públicos que façam o papel de getters e setters. Por exemplo:

```java
public class Conta {
    // ...
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
```

Agora, vamos supor que você tenha uma classe `TestaConta` que possui o seguinte método:

```java
public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.setTitular("Duke");
        minhaConta.setSaldo(1000.0);
        minhaConta.saca(200.0);
        System.out.println(minhaConta.getSaldo());
    }
}
```

O código acima compila e funciona, e é um código muito melhor do que o código anterior. Por exemplo, se você quiser alterar o nome do atributo `saldo` para `saldoAtual`, você não precisará alterar o código em vários lugares. E se você quiser alterar o nome do método `saca` para `retira`, você não precisará alterar o código em vários lugares também.

## O que você deve saber

  * O encapsulamento é a técnica de esconder os detalhes de implementação de um objeto, expondo apenas uma interface de uso.
  * Para esconder os detalhes de implementação, você precisa tornar os atributos privados e criar métodos públicos para acessá-los.
  * Para tornar um atributo privado, você precisa colocar a palavra-chave `private` antes do tipo do atributo.
  * Para criar métodos públicos para acessar os atributos, você precisa criar métodos públicos que façam o papel de getters e setters.

## Exercícios

1. Crie uma classe `Conta` que possui os atributos `titular`, `numero`, `agencia` e `saldo`. Crie os métodos `saca`, `deposita` e `calculaRendimento`. Crie também um método `recuperaDadosParaImpressao` que devolve uma `String` com os valores de todos os atributos da conta. Crie uma classe `TestaConta` com um método `main` que cria uma conta, deposita 1000 reais nela, saca 200 reais e imprime os dados da conta no console.

2. Crie uma classe `Conta` que possui os atributos `titular`, `numero`, `agencia` e `saldo`. Crie os métodos `saca`, `deposita` e `calculaRendimento`. Crie também um método `recuperaDadosParaImpressao` que devolve uma `String` com os valores de todos os atributos da conta. Crie uma classe `TestaGetESet` com um método `main` que cria uma conta, deposita 1000 reais nela, saca 200 reais e imprime os dados da conta no console.

3. Crie uma classe `Conta` que possui os atributos `titular`, `numero`, `agencia` e `saldo`. Crie os métodos `saca`, `deposita` e `calculaRendimento`. Crie também um método `recuperaDadosParaImpressao` que devolve uma `String` com os valores de todos os atributos da conta. Crie uma classe `TestaGetESet` com um método `main` que cria uma conta, deposita 1000 reais nela, saca 200 reais e imprime os dados da conta no console.

4. Crie uma classe `Conta` que possui os atributos `titular`, `numero`, `agencia` e `saldo`. Crie os métodos `saca`, `deposita` e `calculaRendimento`. Crie também um método `recuperaDadosParaImpressao` que devolve uma `String` com os valores de todos os atributos da conta. Crie uma classe `TestaGetESet` com um método `main` que cria uma conta