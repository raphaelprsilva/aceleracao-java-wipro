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

## Métodos default em interfaces

Imagine que você precisa adicionar um novo método a uma interface que já está em uso. Se você fizer isso, o código existente que implementa essa interface não compilará, pois não há implementação para o novo método.

Ou seja, você terá que alterar o código existente para implementar o novo método. Isso pode ser um problema, pois você não pode alterar o código existente.

Os métodos default em interfaces foram introduzidos no Java 8. Eles permitem que você defina um método comum em uma interface, sem quebrar o código existente.

São métodos que podem ser sobrescritos nas classes que implementam a interface.

Eles não são obrigados a implementar os métodos default, mas podem sobrescrevê-los.

Use-as com moderação, pois elas podem dificultar a manutenção do código. É uma ferramenta que deve ser usada com cuidado.