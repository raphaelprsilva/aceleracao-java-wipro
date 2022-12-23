# Operadores de Igualdade e Negação

## Operadores de Igualdade

- São usados para comparar valores
- Os resultados dessas coparações são sempre booleanos

Exemplo 1:

```java
public class OperadoresIgualdadeNegacao {
  public static void main(String[] args) {
    // comparando números
    boolean saoIguaisOsNumeros = 10 == 11;
    System.out.printf("Os números são iguais? %b%n", saoIguaisOsNumeros);
    
    // comparando números
    boolean saoDiferentesOsNumeros = 15 != 23;
    System.out.printf("Os números são iguais? %b%n", saoDiferentesOsNumeros);

    // comparando expressões
    boolean comparaNumeros = (2 + 4) == (2 * 3);
    System.out.printf("Comparação: %b%n", comparaNumeros);

    // operador de negação
    boolean usuarioLogado = true;
    boolean usuarioDeslogado = !usuarioLogado; // não true = false
    System.out.printf("O usuário está logado? %b%n", usuarioDeslogado);
  }
}
```

Fique atento ao tentar comparar strings. É algo um pouco mais complexo. Por isso cuidado!
