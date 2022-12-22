# Abreviando Operadores Aritméticos

É possível escrever operações aritméticas de maneira mais enxuta.

Vamos ver um exemplo:

```java
public class AbreviandoOperadoresAritmeticos {
  public static void main(String[] args) {
    int quantidadeDeCamisetas = 15;

    // suponha que você ganhou mais 3 camisetas
    // quantidadeDeCamisetas = quantidadeDeCamisetas + 3;

    // mas nós podemos abreviar a operação, fazendo assim:
    quantidadeDeCamisetas += 3;
    System.out.println("Quantidade final de camisetas = " + quantidadeDeCamisetas);

    // suponha que você doou 5 camisetas
    quantidadeDeCamisetas -= 5;
    System.out.println("Quantidade final de camisetas = " + quantidadeDeCamisetas);

    // suponha que suas camisetas foram divididas na metade
    quantidadeDeCamisetas /= 2;
    System.out.println("Quantidade final de camisetas = " + quantidadeDeCamisetas);

    // suponha que suas camisetas foram multiplicadas por 5
    quantidadeDeCamisetas *= 5;
    System.out.println("Quantidade final de camisetas = " + quantidadeDeCamisetas);
  }
}
```