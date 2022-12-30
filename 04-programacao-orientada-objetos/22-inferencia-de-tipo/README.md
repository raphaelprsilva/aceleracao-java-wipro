# Inferência de Tipos

A inferência de tipos ocorre quando o compilador deduz o tipo da variável que estamos declarando.

A partir do Java 10, a declaração de tipos deixou de ser obrigatória. Ou seja, é possível pedir que o compilador infira as variáveis.

Para isso acontecer, basta inserir a palavra reservada `var` antes da declaração da variável.

```java
public class Main {
  public static void main(String[] args) {
//  ↓↓↓
    var visitante = new Visitante();

//  ↓↓↓
    var tempoDeEspera = 30;
  }
}
```

Algumas perguntas podem surgir:

1. **Isso torna uma tipagem fraca?** Não
   1. O tipo da variável não pode ser alterado mesmo com o uso do `var`
2. **Posso fazer `var nome = null`?**
   1. Não pois o compilador não consegue inferir o tipo
3. É possível usar o `var` como argumentos de métodos?
   1. Não, pois o método não sabe quem vai chamá-lo