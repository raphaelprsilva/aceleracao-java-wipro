# 📚 Exceções

Durante a execução de um programa, pode ocorrer um erro que interrompe a execução do programa. Por exemplo, se tentarmos acessar um índice de um array que não existe, o programa irá parar de executar e uma exceção será lançada.

Então, as exceções são erros que ocorrem durante a execução de um programa e que interrompem a execução do mesmo.

Em inglês, exceção é chamada de `exception`.

Vamos ver um exemplo de exceção sendo lançada:

```java
public class Excecao {
    public static void main(String[] args) {
        System.out.println("Início");
        int x = 10 / 0;
        System.out.println("Fim");
    }
}
```