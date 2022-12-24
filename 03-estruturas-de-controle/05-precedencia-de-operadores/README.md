# Precedência de Operadores

Quando estamos avaliando expressões que retornarão booleanos, temos que tomar cuidado na precedência de operações.

Mas, o que é isso?

É basicamente a ordem como as verificações são feitas. Essa ordem tem um impacto no resultado da operação.

Use sempre parêntesis para poder utilizar a precedências nas operações, para poder evitar possíveis erros.

Veja o exemplo abaixo:

```java
public class Exemplo {
  public static void main(String[] args) {
    int x = 20;
    int y = 40;
    
    //                 false ||  false  &&  true  = false && true = false
    boolean teste1 = x == 10 || y == 20 && y == 40;

    //                true   && (o restante da operação não é avaliado) = true
    boolean teste2 = x == 20 && y == 30 || y == 32;
    
    //               ( false  &&  false) ||  false = false
    boolean teste3 = (x == 34 && y == 4) || y == 32;

    //                false  && (o restante da operação não é avalida) = false
    boolean teste4 = x == 21 && (y == 4 || y == 32);
  }
}

```