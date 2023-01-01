# Acessando e atribuindo elementos de Arrays

Como acessar elementos em um array? Vamos descobrir, mas antes, vamos ver o que é impresso na tela, quando tentamos imprimir um array.

```java
public class Main {
  public static void main(String[] args) {
    int[] notas = { 2, 6, 9, 10, 5 };

    System.out.println(notas); // [@45264c234
  }
}
```

Estranho né? Isso acontece, pois um array é um objeto, logo, ao tentarmos imprimir na tela, veremos a referência dele!

E como podemos acessar um elemento específico de um array?

```java
public class Main {
  public static void main(String[] args) {
    // posições:    0  1  2   3  4
    int[] notas = { 2, 6, 9, 10, 5 };

    System.out.println(notas[0]); // 2
    System.out.println(notas[1]); // 6
    System.out.println(notas[2]); // 9
    System.out.println(notas[14]); // Lança uma exceção, pois essa posição não existe
  }
}
```

Agora, eu quero alterar o valor da posição 2 do array.

```java
public class Main {
  public static void main(String[] args) {
    // posições:    0  1  2   3  4
    int[] notas = { 2, 6, 9, 10, 5 };
    
    notas[2] = 15;

    System.out.println(notas[2]); // 15
  }
}
```