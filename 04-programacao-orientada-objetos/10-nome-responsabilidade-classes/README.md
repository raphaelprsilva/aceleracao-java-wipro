# Nomes e Responsabilidade de Classes

Imagine que nós trabalhamos para um hospital. Criamos uma classe `Paciente` e definimos nela os métodos:

```java
public class Paciente {
  double altura;
  int peso;

  IndiceMassaCorporal calcularIndiceMassaCorporal() {
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.peso = peso;
    imc.altura = altura;
    imc.resultado = peso / (altura * altura);

    return imc;
  }
  
  void agendarConsulta() {

  }
  
  void agendarExame() {
    
  }
  
  void darAlta() {
    
  }
  
  void internar() {
    
  }
}
```

- É importante definir bem o que uma classe deve ter enquanto atributos, métodos e responsabilidades.
- Dependendo da maneira como for "projetada", uma classe ser de difícil manutenção, à medida que for crescendo.
- Repare que a nossa classe `Paciente` tem um método `calcularIndiceMassaCorporal`.
  - Mas, realmente faz sentido essa classe ter esse método? Acho que não...
  - Por isso, vamos refatorar a nossa classe.

Refatorando...

1. Alteraremos o nome da Classe para `CalculadoraImc`;
2. Não faz sentido uma calculadora ter atributos `altura` e `peso`. Removemos as duas;
3. Alteraremos o nome do método `calcularIndiceMassaCorporal` para `calcular`;
   1. para cacular o IMC, eu ainda preciso do `peso` e da `altura`;
   2. por isso passaremos esses dois parâmetros para o método `calcular`;

```java
public class CalculadoraImc {
  IndiceMassaCorporal calcular(double peso, double altura) {
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.peso = peso;
    imc.altura = altura;
    imc.resultado = peso / (altura * altura);

    return imc;
  }
}
```

Quando vou instanciar um novo objeto do tipo `CalculadoraImc`, fica assim:

```java
public class Main {
  public static void main(String[] args) {
    CalculadoraImc calculadoraImc = new CalculadoraImc();
    double peso = 67.3;
    double altura = 1.73;

    IndiceMassaCorporal imcPaciente = calculadoraImc.calcular(peso, altura);
    System.out.printf("IMC paciente: %f%n:", imcPaciente.resultado);
  }
}
```

### Refatorando a classe `CalculadoraImc`

Podemos passar para o método `calcular` um objeto. Mas qual tipo de objeto?

- Pergunta:
  - Que tipo de objeto tem peso e altura? `Paciente`

Então, vamos criar uma classe do tipo `Paciente`. Repare que a classe não tem comportamentos, apenas dois atributos.

```java
public class Paciente {
  double peso;
  double altura;
}
```

```java
public class CalculadoraImc {
  //                           \/\/\/\/\/\/\/\/
  IndiceMassaCorporal calcular(Paciente paciente) {
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.peso = paciente.peso;
    imc.altura = paciente.altura;
    imc.resultado = paciente.peso / (paciente.altura * paciente.altura);

    return imc;
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    CalculadoraImc calculadoraImc = new CalculadoraImc();
    Paciente meuPaciente = new Paciente();
    meuPaciente.peso = 67.3;
    meuPaciente.altura = 1.73;

    IndiceMassaCorporal imcPaciente = calculadoraImc.calcular(meuPaciente);
    System.out.printf("IMC paciente: %f%n:", imcPaciente.resultado);
  }
}
```