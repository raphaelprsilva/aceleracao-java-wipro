# Transformando Arrays em Representações String

Como já vimos, se eu tentar printar na tela e ver o que o array tem nele, eu vejo algo bem estranho.

```java
public class Main {
  public static void main(String[] args) {
    int[] notas = { 2, 6, 9, 10, 5 };

    System.out.println(notas); // [@45264c234
  }
}
```

Existe uma classe chamada `Arrays`. Ela irá nos auxiliar na visualização do conteúdo de um Array.

```java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] notas = {2, 6, 9, 10, 5};

    String notasComoString = Arrays.toString(notas);
    System.out.println(notasComoString); // [2, 6, 9, 10, 5]
  }
}
```