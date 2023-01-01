# Ordenando Arrays na ordem natural e reversa

Existe um método dentro da classe auxiliar `Arrays` que nos auxilia na ordernação dos elementos de um array,

Vejamos:

## Ordenando do menor para o maior

```java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] notas = {30, 4, 100, 28, 54};

    Arrays.sort(notas);

    System.out.println(Arrays.toString(notas));
  }
}
```

## Ordenando do maior para o menor

```java
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    Integer[] notas = {30, 4, 100, 28, 54};

    Arrays.sort(notas, Comparator.reverseOrder());

    System.out.println(Arrays.toString(notas));
  }
}
```