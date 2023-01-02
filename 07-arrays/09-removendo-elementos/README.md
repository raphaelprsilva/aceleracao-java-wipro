# Removendo Elementos de Arrays

De antemão, vale ressaltar:

> Não é possível remover elementos de arrays.

Mas como vamos fazer isso então? Criando uma cópia do array original, só que com posições à menos.

```java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numerosJogoAtual = {23, 3, 54, 34, 17, 39, 9};

    // criamos um novo array com uma posição a menos (6 posições)
    int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

    // desejamos remover o terceiro elemento (54)
    int indiceExclusao = 2;

    System.arraycopy(numerosJogoAtual, 0, numerosNovoJogo, 0, indiceExclusao);
    System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosNovoJogo, indiceExclusao, numerosNovoJogo.length - indiceExclusao);
  }
}
```