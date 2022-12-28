# Métodos que retornam objetos

É Possível retornar um objeto em um método de classe.

A notação seria algo semelhante à isso:

```java
public class Paciente {
  double altura;
  int peso;

  // O método retorna um objeto do tipo IndiceMassaCorporal
  IndiceMassaCorporal calcularIndiceMassaCorporal() {
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.peso = peso;
    imc.altura = altura;
    imc.resultado = peso / (altura * altura);

    return imc;
  }
}
```

Onde `IndiceMassaCorporal` é:

```java
public class IndiceMassaCorporal {
  double resultado;
  double peso;
  double altura;

  boolean estaSaudavel() {
    return resultado >= 30;
  }
}

```