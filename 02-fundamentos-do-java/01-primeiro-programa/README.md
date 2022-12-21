# Primeiro Programa em Java

Vamos começar de um modo que, à princípio, pode parecer difícil, mas que nos ajudará mais à frente.

- Escolha um editor de texto plano, ou seja, sem formatações (`plain text`).
- Não se preocupe com a nomenclatura do que vamos escrever.
- Repare que letras maíusculas e minúsculas fazem diferença na linguagem.
- Escreva o código abaixo:
    ```java
    public class OlaMundo {
      public static void main(String[] args) {
        System.out.println("Olá Mundo");
      }
    }
    ```
    - Salve-o em uma pasta de sua preferência.
    - Salve o arquivo com o nome `OlaMundo.java`.
    - Abra o terminal e acesse a pasta que você salvou o arquivo.
    - Use o comando `javac OlaMundo.java` para compilar o arquivo.
    - Caso apareça alguma mensagem, é porque deu erro. Caso contrário, deu tudo certo.
    - Um arquivo `javac OlaMundo.class` será criado. É um arquivo Bytecode.
    - Para executar o arquivo Bytecode, vamos usar o comando `java OlaMundo`.
