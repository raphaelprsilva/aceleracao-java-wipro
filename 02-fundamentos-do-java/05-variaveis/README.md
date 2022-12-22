# Variáveis

- Em todas as linguagens existem variáveis. Mas o que elas são?
- São uma maneira de armazenar dados.
- Esses dados podem se alterar ao longo da execução de um programa.
- Quando vamos declarar uma variável em Java, nós precisamos definir:
  - qual o tipo de informação desejamos armazenar na variável
  - No Java, uma vez que definimos o tipo da variável, não é possível alterá-lo
- Veja o exemplo abaixo:

```java
public class OlaMundo {
  public static void main(String[] args) {
    // declaramos uma variável do tipo inteiro e nela armazenamos o valor 40
    int minhaIdade = 40;

    // declaramos uma variável do tipo inteiro e nela armazenamos o valor 25
    int suaIdade = 25;

    // declaramos uma variável do tipo inteiro e nela armazenamos a soma das outras variáveis
    int totalIdades = minhaIdade + suaIdade;

    // Depois imprimimos a soma das idades
    System.out.println("Soma das idades:" + totalIdades);
  }
}
```

> Boas práticas ao declarar variáveis:

- Declare uma variável por linha
- Fazer isso, não é recomendado:
```java
public class OlaMundo {
  public static void main(String[] args) {
    // Não recomendado
    int minhaIdade = 40, suaIdade = 25;

    int totalIdades = minhaIdade + suaIdade;

    System.out.println("Soma das idades:" + totalIdades);
  }
}
```
- Declare variáveis em `lowerCamelCase`:
  - Exemplo do Recomendável:
    - `int minhaIdade`
  - Exemplos do Não-Recomendável:
    - `int MinhaIdade`
    - `int MINHA_IDADE`
    - `int minha_idade`

- Declare variáveis bastante descritivas e compreensíveis:
  - Exemplo do Recomendável:
    - `int totalDePessoas`
  - Exemplo do Recomendável:
    - `int totIdd`
    - `int a` - O que `a` significa? Outra pessoa vai facilmente identificar o que significa?
    - `int b` - O que `b` significa?

- Não é possível declarar uma variável começando com um valor numérico.
  - Exemplo: `int 1totalDePessoas`
    - Isso gerará um erro de compilação