# Modificadores de Acesso

O que são modificaores de acesso? São mecanismos que alteram a visibilidade de atributos, construtores e métodos de uma classe.

Temos os seguintes modificadores de acesso:

- `public` - permite acesso à tudo. Fica visível para qualquer outra classe.
- `default` - quando não há nenhum modificador de acesso explícito, o padrão é `default`.
- `private` - deixa o acesso restrito apenas para a classe em específico
  - Não serve assim: `private class Produto { ... }`
  - Construtores podem ser `private`
  - Métodos podem ser `private`
  - Atributos podem ser `private`

Exemplo:

```java
// ↓↓↓
public class Produto {
  // esse atributo por padrão é default
  static String codigo;
  // ↓↓↓ esse é public
  public int quantidadeEstoque;
  // ↓↓↓↓ atributo privado, ou seja, disponível apenas na classe
  private String nome;
}
```