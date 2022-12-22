# Operadores Aritméticos

É possível realizar várias operações matemáticas com Java. Veja o exemplo abaixo:

- Rode o arquivo na sua máquina e veja o resultado.
- Para rodar basta usar o comando: `java OperadoresAritmeticos.java`;

```java
// arquivo OperadoresAritmeticos.java
public class OperadoresAritmeticos {
  public static void main(String[] args) {
    int minhaIdade = 40;
    int suaIdade = 25;

    // adição
    int somaDasIdades = minhaIdade + suaIdade;
    System.out.println("Soma das idades:" + somaDasIdades);

    // subtração
    int diferencaDasIdades = minhaIdade - suaIdade;
    System.out.println("Diferença das idades:" + diferencaDasIdades);

    // multiplicação
    int multiplicacaoDasIdades = minhaIdade * suaIdade;
    System.out.println("Multiplicação das idades:" + multiplicacaoDasIdades);

    // divisão
    int metadeDaSuaIdade = suaIdade / 2; // Resultado = 12 -> Isso acontece pois a variável foi declarada como inteiro
    System.out.println("Metade da idade:" + metadeDaSuaIdade);

    // Módulo
    int restoDaDivisao = 8 % 3;
    System.out.println("Resto da divisão de 8 por 3 = " + restoDaDivisao);
  }
}
```

Também é preciso se atentar na ordem com que as operações acontecerão.

Veja o exemplo abaixo:

```java
public class CalculaMediaIdades {
  public static void main(String[] args) {
    int minhaIdade = 30;
    int suaIdade = 20;
    int idadeJoao = 40;

    int mediaDasIdades = minhaIdade + suaIdade + idadeJoao / 3; // 63
    System.out.println("Media das idades = " + mediaDasIdades);
  }
}
```

- O resultado é inconsistente, não é?
- Isso ocorre pois, primeiro é feita a operação `idadeJoao / 3`, para depois esse resultado ser somado com as outras variáveis
- Para evitar o erro, inserimos parêntesis na soma das idades, ficando assim:

```java
public class CalculaMediaIdades {
  public static void main(String[] args) {
    int minhaIdade = 30;
    int suaIdade = 20;
    int idadeJoao = 40;

    int mediaDasIdades = (minhaIdade + suaIdade + idadeJoao) / 3; // 30
    System.out.println("Media das idades = " + mediaDasIdades);
  }
}
```