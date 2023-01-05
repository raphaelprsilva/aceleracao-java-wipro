# Múltiplas Classes Não-Públicas em um único arquivo

Você sabia que é possível inserir mais de uma classe em um arquivo `.java`?

Isso só é possível se apenas uma classe for `public` e as outras não.

Exemplo:

```java
// arquivo Produto.java

public class Produto {
  // ...
}

class Forncedor {
  // ...
}
```

O exemplo acima funciona perfeitamente. A classe fornecedor é `default`.

E quando isso seria útil? Isso é algo difícil de acontecer, pois a manutenção dos códigos é difícil.
Isso é mais usado em demonstrações ou aulas.