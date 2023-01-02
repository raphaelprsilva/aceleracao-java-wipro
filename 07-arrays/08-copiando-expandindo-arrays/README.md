# Copiando e Expandindo Arrays

### Criando uma cópia de um array

Vamos usar o método `copyOf` da classe `Arrays` para poder copiar um array.

O método `copyOf` recebe dois parâmetros obrigatórios:

1. array a ser copiado
2. a quantidade de posições a serem copiadas

```java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numerosJogo1 = {12, 34, 24, 54, 3, 23};

    // vamos copiar apenas 3 posições do array `numerosJogo1`
    int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, 3);

    System.out.println(Arrays.toString(numerosJogo1));
    System.out.println(Arrays.toString(numerosJogo2));
  }
}
```

### Expandindo um array

```java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numerosJogo1 = {12, 34, 24, 54, 3, 23};

    // copiamos todos os elementos do array e adicionamos uma posição à cópia
    int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);

    // atribuindo um valor para a nova posição
    numerosJogo2[numerosJogo2.length - 1] = 87;

    System.out.println(Arrays.toString(numerosJogo1));
    System.out.println(Arrays.toString(numerosJogo2));
  }
}
```