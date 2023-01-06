# JavaBeans, Getters e Setters

## JavaBeans

JavaBeans é um padrão de projeto que define uma convenção para a criação de classes que representam objetos. Essas
classes são chamadas de JavaBeans (Beans em inglês significa grãos).

Para que uma classe seja considerada um JavaBean, ela deve seguir algumas regras:

- Deve ter um construtor público sem argumentos
- Deve ter atributos privados
- Deve ter métodos públicos para acessar seus atributos (getters)
- Deve ter métodos públicos para modificar seus atributos (setters)
- Deve ter métodos públicos para adicionar e remover listeners (listeners são objetos que ficam escutando eventos da
  classe)
- Deve ter métodos públicos para adicionar e remover PropertyChangeListeners
    - PropertyChangeListeners são objetos que ficam escutando mudanças em propriedades da classe
- Deve ter métodos públicos para adicionar e remover VetoableChangeListeners
    - VetoableChangeListeners são objetos que ficam escutando mudanças em propriedades da classe e podem cancelar a
      mudança

## Getters e Setters

Getters e Setters são métodos públicos que permitem acessar e modificar atributos privados de uma classe.

Por exemplo, vamos supor que você tenha uma classe `Conta` que possui os seguintes atributos:

```java
import java.io.Serializable;

public class Conta extends Serializable {

  public Conta() {
    
  }

  private String titular;
  private int numero;
  private String agencia;
  private double saldo;
  private String dataAbertura;
}
```

Para criar métodos públicos para acessar os atributos, você precisa criar métodos públicos que façam o papel de getters
e setters. Por exemplo:

```java
import java.io.Serializable;

public class Conta extends Serializable {
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
    Conta conta = new Conta();
    conta.setTitular("Hugo");
    conta.setNumero(123);
    conta.setAgencia("45678-9");
    conta.setSaldo(50.0);
    conta.setDataAbertura("04/06/2016");

    System.out.println("Titular: " + conta.getTitular());
    System.out.println("Número: " + conta.getNumero());
    System.out.println("Agência: " + conta.getAgencia());
    System.out.println("Saldo: " + conta.getSaldo());
    System.out.println("Data de Abertura: " + conta.getDataAbertura());
  }
}
```

O resultado da execução desse método é:

```
Titular: Hugo
Número: 123
Agência: 45678-9
Saldo: 50.0
Data de Abertura: 04/06/2016
```

## Exercícios

1. Crie uma classe `Conta` que possui os seguintes atributos:
    - titular
    - número
    - agência
    - saldo
    - data de abertura
    - limite
    - rendimento mensal
    - getters e setters que façam sentido

2. Crie uma classe `TestaConta` que possui um método `main` que cria uma conta e imprime todos os seus atributos.
