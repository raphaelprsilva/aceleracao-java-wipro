# Arrays

Até o momento, trabalhamos com variáveis do tipo `int`, `char`, `short`, `long`, `String`, `double`, `float` e `boolean`.

Podemos dizer de maneira bem simples que, quando declaramos uma variável e atribuímos um tipo a ela, a mesma armazena apenas um valor.

Certo, mas e se eu quiser armazenar uma sequência de valores que são semelhantes entre si? Como posso fazer isso?

É aí que entram em cena os `Arrays`.

### Criando um `array`

Para criar um array, basta utilziar a sintaxe abaixo:

~~~java
int[] myIntArray = new int[10]; // estamos criando um array que cabem 10 variáveis
~~~

Para inserir um número inteiro no array:

~~~java
int[] myIntArray = new int[10]; // estamos criando um array que cabem 10 variáveis
myArray[5] = 10;
~~~

Quando fazemos `myArray[5] = 10`, estamos inserindo o valor `10`, na posição `6`, pois arrays começam na posição `0`.

Se eu quiser ver o que tem no array imprimindo no console, eu preciso fazer:

~~~java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] myIntArray = new int[10]; // estamos criando um array que cabem 10 variáveis
    myIntArray[5] = 50;
    System.out.println(Arrays.toString(myIntArray));
  }
}
~~~