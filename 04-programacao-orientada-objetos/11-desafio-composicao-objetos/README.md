# Desafio de Composição

Uma empresa contratou você para continuar desenvolvendo seu sistema de folha de pagamento.

A primeira função que precisa ser desenvolvida é o cálculo do pagamento dos funcionários.

A empresa fornece o seguinte código pré-criado.

Implementação:

```java
public class FolhaPagamento {
  double calcularSalario() {
    // TODO implementar
  }
}
```

O método `calcularSalario` deve receber os seguintes parâmetros para calcular o salário total a ser pago.

- Quantidade de horas normais trabalhadas
- Quantidade de horas extras trabalhadas
- Valor da hora normal
- Valor da hora extra

É preciso calcular cada horário de trabalho com base no valor horário, somar os valores resultantes e retornar o resultado.

Crie uma classe com um método principal para chamar o método implementado e coloque o resultado (salário não pago) na saída.

O desenvolvedor sênior da empresa que te contratou revisou o seu código e pediu algumas alterações.

Você deve criar uma classe Funcionario com as seguintes propriedades:

- Nome
- Quantidade de filhos

E também, deve criar uma classe ContratoTrabalho com as propriedades:

- Funcionário (ou seja, uma variável do tipo Funcionario)
- Valor da hora normal
- Valor da hora extra

Depois, você deve refatorar o método calcular da classe `FolhaPagamento` para
receber um objeto do tipo `ContratoTrabalho` como parâmetro, substituindo os
parâmetros de valores de hora.

Além disso, uma nova regra deve ser adicionada neste mesmo método:

Quando o funcionário possuir 1 ou mais filhos, você deve calcular um adicional de 10% no
valor total do salário.

Crie métodos na classe Funcionario e ContratoTrabalho para que você possa
"perguntar" ao objeto se o contrato possui ou não o adicional para filhos, tornando assim
essas classes mais ricas.

Mais uma alteração foi solicitada para você.

Agora, você deve alterar o código do método `calcularSalario` da classe `FolhaPagamento` para retornar um novo tipo `Holerite`.

A classe Holerite deve ter as seguintes propriedades:

- Funcionário
- Valor total das horas normais
- Valor total das horas extras
- Valor do adicional para filhos

Além disso, a classe Holerite deve possuir os seguintes comportamentos/métodos:

- Calcular valor total (deve somar todos os valores e chegar no valor total)
- Imprimir (deve imprimir na saída todos os detalhes do holerite)