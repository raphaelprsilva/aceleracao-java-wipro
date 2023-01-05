# Importando membros estáticos

É possível importar membros estáticos de uma classe.

Vamos ver o exemplo abaixo:

Imagine que temos duas classes. Uma `CalculadoraArea` e outra `Main`.

A `CalculadoraArea` tem 3 membros estáticos. Uma constante e dois métodos.

```java
public class CalculadoraArea {

  public static final double PI = 3.14159265358979323846;

  public static double calcularAreaQuadrado(double medidaDoLado) {
    return medidaDoLado * medidaDoLado;
  }

  public static double calcularAreaCirculo(double raio) {
    return raio * raio * CalculadoraArea.PI;
  }

}
```

Sabendo disso, ao importar os métodos e atributos da classe `CalculadoraArea` na Main, podemos
utilizar o recurso dos membros estáticos. Veja como fica a importação e a sintaxe.

```java
// veja a sintaxe
import static com.elraphael.matematica.CalculadoraArea.*;

public class Main {

  public static void main(String[] args) {
    double areaQuadrado = calcularAreaQuadrado(5.2);
    double areaCirculo = calcularAreaCirculo(10.5);

    System.out.printf("PI: %.2f%n", PI);
    System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
    System.out.printf("Área do círculo: %.2f%n", areaCirculo);
  }

}
```