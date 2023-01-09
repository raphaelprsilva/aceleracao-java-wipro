# Boas Práticas - Encapsulamento

<details>
  <summary><b>Use métodos de acesso em classes públicas (tell, don't ask)</b></summary>

- Use métodos de acesso em classes públicas
    - getters e setters
- Deixe os atributos privados
    - Isso evita que outras pessoas alterem o estado do objeto
- O princípio "Tell, don't ask" (Diga, não pergunte) diz que você já deve informar o que deve ser feito, e não perguntar
    - Exemplo: `if (pessoa.eMaiorDeIdade())` ao invés de `if (pessoa.getIdade() > 18)`
    - Isso evita que você tenha que saber como a pessoa é maior de idade
    - Você só precisa saber que ela é maior de idade

</details>

<details>
  <summary><b>Lei de Demeter</b></summary>

- A Lei de Demeter diz que um objeto não deve chamar métodos de outro objeto
- Exemplo: `pessoa.getCarro().getMotor().getPotencia()`
- Isso pode ser resolvido com o uso de métodos de acesso
    - Exemplo: `pessoa.getPotenciaDoMotorDoCarro()`
    - Isso é chamado de "Tell, don't ask"
    - Você já deve informar o que deve ser feito, e não perguntar
- Os métodos só podem chamar:
    - Métodos do próprio objeto
    - Métodos de objetos passados como parâmetro
    - Exemplo:

  ```java
    public class Pessoa {
      private Carro carro;
    
      public void setCarro(Carro carro) {
        this.carro = carro;
      }
    
      public int getPotenciaDoMotorDoCarro() {
        return carro.getMotor().getPotencia();
      }
    }
    ```

    - Métodos de objetos criados dentro do método
    - Exemplo:

  ```java
    public class Pessoa {
      private Carro carro;
    
      public void setCarro(Carro carro) {
        this.carro = carro;
      }
    
      public int getPotenciaDoMotorDoCarro() {
        Motor motor = carro.getMotor();
        return motor.getPotencia();
      }
    }
  ```

</details>

<details>
  <summary><b>Não permita instanciação de construtor privado</b></summary>

- Não permita instanciação de construtor privado
- Isso evita que outras pessoas instanciem a classe
- Exemplo:

```java
  public class CalculadoraArea {
  private CalculadoraArea() {
    // ...
  }

  public static double calculaAreaCirculo(double raio) {
    // ...
  }
}
```

- A chamada do método `CalculadoraArea.calculaAreaCirculo(10)` é possível sem instanciar a classe
- Isso pode ser feito com o uso de um construtor privado

</details>

<details>
  <summary><b>Crie cópias defensivas</b></summary>

- Crie cópias defensivas
- Mas o que é isso?
- é uma técnica usada para evitar que o estado de um objeto seja alterado
- Exemplo:

```java
public class Agendamento {

  private final Horario horario;
  private final String descricao;

  public Agendamento(Horario horario, String descricao) {
    // cria uma cópia defensiva
    this.horario = new Horario(horario.getHora(), horario.getMinuto());
    this.descricao = descricao;
  }

  public Horario getHorario() {
    // cria outra cópia defensiva para evitar que a cópia original seja alterada
    return new Horario(horario.getHora(), horario.getMinuto());
  }

}
```

</details>

<details>
  <summary><b>Minimize a Imutabilidade</b></summary>

- Uma classe imutável é quando após um objeto instanciado, não pode ter seu estado alterado
- Exemplo:
    - Classe `String` é imutável
    - Classe `Integer` é imutável

- Uma classe mutável é quando eu consigo alterar o estado do objeto após sua instanciação
- Exemplo:

```java
public class Main {

  public static void main(String[] args) {
    Horario horario = new Horario(10, 30);
    // aqui eu alterei o estado da classe "Horario"
    horario.setHora(11);
  }

}
```

- Como criar uma classe imutável?
    - Crie uma classe com todos os atributos privados
    - Os atributos de instância precisam ser `final`
    - Crie um construtor que receba todos os atributos como parâmetro
    - Não devemos ter métodos `setters` pois não queremos alterar os atributos
    - Não permitir que a classe seja herdada
    - Crie um método `get` para cada atributo
    - Crie um método `equals` para comparar os objetos
    - Crie um método `hashCode` para comparar os objetos
    - Exemplo:

```java
public class Horario {
  private final int hora;
  private final int minuto;

  public Horario(int hora, int minuto) {
    if (hora < 0 || hora > 23) {
      throw new IllegalArgumentException("Hora inválida");
    }

    if (minuto < 0 || minuto > 59) {
      throw new IllegalArgumentException("Minuto inválido");
    }

    this.hora = hora;
    this.minuto = minuto;
  }
}
```

- Quais as desvantagens de se ter um objeto imutável?
  - É necessário instanciar um novo objeto toda vez que precisar alterar o estado
  - Use objetos imutáveis se você achar necessário
  - Use para classes que representam números, documentos, valores, cores
  
</details>