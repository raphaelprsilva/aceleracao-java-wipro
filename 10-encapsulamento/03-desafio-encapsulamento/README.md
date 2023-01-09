# Desafio - Getters e Setters

Nesse desafio, implemente uma classe chamada `ContaPagar` que possui os seguintes atributos:

- `descricao` do tipo `String`
- `valor` do tipo `double`
- `dataVencimento` do tipo `String`
- `pago` do tipo `boolean`

Além disso, implemente os seguintes métodos:

- `pagar` sem argumentos e retorna `void`. Esse método deve alterar o valor do atributo `pago` para `true`.
  - Lance uma exceção do tipo `IllegalStateException` caso o atributo `pago` já esteja `true`.
- `cancelarPagamento` sem argumentos e retorna `void`. Esse método deve alterar o valor do atributo `pago` para `false`.
  - Lance uma exceção do tipo `IllegalStateException` caso o atributo `pago` já esteja `false`.

A classe `ContaPagar` tem uma relação com a classe `Fornecedor`. A classe `Fornecedor` possui os seguintes atributos:

- `nome` do tipo `String`

E possui dois construtores:

- `Fornecedor(String nome)` que recebe o nome do fornecedor e inicializa o atributo `nome`.
- `Fornecedor()` que inicializa o atributo `nome` com uma `String` vazia.