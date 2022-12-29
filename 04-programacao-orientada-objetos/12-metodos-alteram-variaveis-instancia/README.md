# Métodos que alteram variáveis de instância

Podemos criar métodos que alteram os atributos de um objeto instanciado.

No nosso caso, temos uma classe `Aeronave` que tem um método `desativar` que altera
o status da aeronave. Ele basicamente faz isso, altera o valor do atributo.

```java
public class Aeronave {
  boolean ativo = true;
  int totalAssentos;
  int assentosReservados;

  int calculaAssentosDisponiveis() {
    return totalAssentos - assentosReservados;
  }

  // aqui
  void desativar() {
    ativo = false;
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    Aeronave aeronave = new Aeronave();
    aeronave.totalAssentos = 100;

    // para desativar o avião, eu poderia fazer assim
    // aeronave.ativo = false;

    // mas isso se tornaria contraprodutivo ao longo do tempo
    // então, podemos criar um método para ter tal ação
    aeronave.desativar();

    System.out.printf("Aeronave Ativa: %b%n", aeronave.ativo);
  }
}
```

O que tem estar claro é que, se eu instanciar um novo objeto do tipo `Aeronave`,
ou seja, `Aeronave aeronave2 = new Aeronave()` e por ventura usar algum método nela,
será alterado apenas o atributo dessa instância, e não de outra. Devo lembrar que os objetos
criados possuem referências diferentes na memória, apesar de serem do tipo `Aeronave`.