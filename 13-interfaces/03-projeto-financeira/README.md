# Projeto Solução Financeira

Vamos trabalhar com um projeto de uma solução financeira, onde vamos trabalhar com um sistema de empréstimos.

Temos uma classe abstrata `Empresa` que representa uma empresa qualquer com atributos e métodos abstratos.

Depois, temos as classes `Industria`, `Fazenda` e `LojaVarejista` que herdam de `Empresa` e implementam os métodos abstratos.

Por fim, temos a classe `ServicoFinanciamento` que representa um serviço de financiamento de empresas. Ou seja, nela temos uma
composição com a classe `Empresa` e podemos fazer operações de financiamento com elas.

Da maneira como está, não há problemas. Mas, imagine se surge uma demanda de que haverá um `ParceiroFinanceiro`, e ele que emprestará
dinheiro para as empresas.

- `ParceiroFinanceiro` também é uma empresa, mas não é uma empresa qualquer, é uma empresa que empresta dinheiro para outras empresas.
- Só que, à partir daí surge outro problema. Como `ParceiroFinanceiro` é uma empresa, ele também precisa implementar os métodos abstratos de `Empresa`.