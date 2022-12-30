# Boas Práticas no Java: Código Limpo e Efetivo

<details>
    <summary><strong>Por que usar boas práticas?</strong></summary>


- É importantíssimo usar boas práticas de programação, pois isso:
  - reduz o tempo com retrabalhos;
  - define padrões que qualquer programador consegue ler e identidicar;
  - produz código de fácil manutenção;
  - reduz a probabilidade de existência de bugs;
  - facilita encontrar bugs no sistema;
  - facilita o trabalho do time que está trabalhando no projeto;
</details>

<details>
    <summary><strong>Escolha Bons nomes</strong></summary>


- Nomeie de maneira clara e objetiva os nomes de variáveis, classes e etc;
- Nomes fazem parte da comunicação;
  - Nomes ruins podem gerar problemas de compreensão por parte de outros programadores e até por você mesmo;
  - Bons nomes facilitam a compreensão por parte de outra pessoa;
- Nomear coisas é uma tarefa difícil, mas leve um tempo pensando no melhor nome para uma variável ou método;
- Exemplos:
  - **Ruins:**
    - `int d;` - O que significa esse `d`?
    - `int dias;` - Dias de que?
    - `Cliente cliente1`
    - `int qtdPrdEst`
    - `class Processar {`
  - **Bons**:
    - `int tempoDeEntregaGastoEmDias;`
    - `boolean usuarioEstaLogado;`
    - `Cliente clienteCadastrado`
    - `int quantidadeProdutosEmEstoque`
    - `class ProcessarFolhaDePagamento {`
</details>

<details>
    <summary><strong>Tamanho e Organização de Classes</strong></summary>


- É importantíssimo definir uma estrutura para as classes:

```java
public class Cliente {
  // 1º - Atributos de classe
  static final double TAXA_LIMITE_CREDITO = 0.10;
  static final double LIMITE_CREDITO_MINIMO = 10_000;

  // 2º - Atributos de instância
  String razaoSocial;
  double faturamentoAnual;

  // 3º - Métodos
  double calcularLimiteDeCredito() {
    // ...
  }
}
```

- Defina bem a resposabilidade de uma `Classe`.
  - Ela deve ter descrever a responsabilidade que ela tem.

</details>

<details>
    <summary><strong>Comentários no Código</strong></summary>


- Não é recomendado inserir comentários de maneira exagerada no código;
- Ele (o código) por si só, deve ser autoexplicativo;
- Insira comentários apenas quando a lógica for demasiadamanete complexa ou tenha um treho que não é tão óbvio para quem for ler
- O comentário pode "mentir", ou seja, se alguém refatorar o código e não mudar o comentário, ele pode conter uma informação incorreta
</details>

<details>
    <summary><strong>Métodos Pequenos e Com responsabilidade única</strong></summary>


- Métodos devem ser pequenos e ter responsabilidade única;
- Um método com uma linha seria o ideal; hehe
- Mas entre 10 a 20 linhas seria bacana;
- Mas, sempre que ficar grande demais, decomponha o método em outros;
</details>

<details>
    <summary><strong>Argumentos de Métodos</strong></summary>


- Qual o número ideal de argumentos de métodos? Zero! Isso mesmo.
- Mas sabemos que isso às vezes não é possível.
  - Defina no máximo 3 argumentos para um método
- Quanto maior a quantidade de argumentos, mais problemas podemos acrescentar ao método
  - Passar variáveis incorretas
  - Perder tempo procurando em qual posição passar o argumento
</details>

<details>
    <summary><strong>Valide os Argumentos de Métodos</strong></summary>


- Nunca passe um `null` para o argumento.
- Crie uma sobrecarga de métodos.
    - Defina no máximo 3 argumentos para um método
- Cheque se os valores que estão sendo passados para o método;
</details>