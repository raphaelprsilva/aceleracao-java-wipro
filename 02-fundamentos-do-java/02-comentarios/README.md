# Comentários em Java

- Comentários são uma forma de descrever algo que não é tão explícito no código escrito
- Eles devem ser usados com cautela, pois o seu código de maneira geral deve ser autoexplicativo
- Os comentários não são compilados
- Existem dois tipos de comentários
    - De linha
        - Usa-se o: `// comentário aqui`
    - De bloco
        - Usa-se o: `/* comentário dentro do bloco */`

- Exemplo no programa:

```java
// este é um comentário de linha
public class OlaMundo {
  public static void main(String[] args) {
    /*
        Este é um comentário de bloco
     */
    System.out.println("Olá Mundo");
  }
}
```