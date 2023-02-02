# Alto Acoplamento com Herança

No problema de hoje veremos que usar herança, pode gerar alto acoplamento.

Vamos ver o código escrito e refletir sobre.

Nós usamos o embrulha e desembrulha para resolver o problema de alto acoplamento.

Delegamos a responsabilidade de desembrulhar para a classe que sabe como desembrulhar.

Esse padrão de projeto se chama Decorator.

Ele é muito usado em Java, mas também é muito usado em outras linguagens.

Veja o código nos arquivos.

## Projete interfaces com cuidado

O código que você escreve, é usado por outras pessoas.

Se você escrever interfaces ruins, as pessoas vão ter que escrever código ruim para usar seu código.

Se você escrever interfaces boas, as pessoas vão escrever código bom para usar seu código.

Quando se usa métodos defaults em interfaces, você está escrevendo uma interface ruim. Isso porque você obriga as pessoas a implementarem ou sobrescreverem o método criado.
