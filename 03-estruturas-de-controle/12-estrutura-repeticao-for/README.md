# Estrutura de Repetição `for`

Como o próprio nome diz, a estrutura de repetição for é usada iterar várias vezes enquanto uma condição for veradadeira.

É recomendado utilizá-la, quando sabemos de antemão, quantas vezes precisamos iterar.

A estrutura básica é:

```
for (iniciação; condição; incremento ou decremento) {
  nossa lógica aqui
}
```

Em um exemplo prático:

```java
public class EstruturaFor {
  public static void main(String[] args) {
    // vai imprimir de 0 a 10
    for (int index = 0; index <= 10; index += 1) {
      System.out.println(index);
    }

    // vai imprimir de 10 até 0
    for (int index = 10; index >= 0; index -= 1) {
      System.out.println(index);
    }
    
    // loop inifinito
    for(;;) {
      System.out.println("loop infinito");
    }
  }
}
```

Tome cuidado com loops infinitos. Se você não inserir critérios de parada adequados ou mesmo incrementos corretos, você pode gerar um loop inifinito.
