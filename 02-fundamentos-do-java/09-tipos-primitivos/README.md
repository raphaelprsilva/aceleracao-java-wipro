# Tipos Primitivos

Existem vários tipos de dados no Java. Entre eles, estão os tipos primitivos.

Cada tipo possui um tamanho de armazenamento. Veja a tabela abaixo:

- `bit` - menor unidade de armazenamento

| Tipo    | Tamanho (bits) | Menor Valor | Maior Valor |
|---------|----------------|-------------|-------------|
| boolean | 1              | false       | true        |
| char    | 16             | 0           | 2¹⁶ - 1     |
| byte    | 8              | -2⁷         | 2⁷ - 1      |
| short   | 16             | -2¹⁵        | 2¹⁵ - 1     |
| int     | 32             | -2³¹        | 2³¹ - 1     |
| long    | 64             | -2⁶³        | 2⁶³ - 1     |
| float   | 32             | -           | -           |
| double  | 64             | -           | -           |

Exemplos:

- **boolean**
  - `boolean compraAprovada = true;`
  - Isso não é aceitado: `boolean compraAprovada = 1;`
  - Pode receber expressões que retornam um booleano
    ```java
    int quantidadeProdutoEmEstoque = 20;
    int quantidadePedido = 30;
    boolean aprovaPedido = quantidadeProdutoEmEstoque >= quantidadePedido;
    ```

- **char** - caractere
  - Compila:
    - `char inicialDoNome = 'R';`
    - `char simbolo = '@';`
  - Não Compila:
    - `char inicialDoNome = "R";`
    - `char inicialDoNome = 'Raphael';`

- **byte**
  - Compila:
    - `byte maiorValor = 127;` - maior valor aceito
  - Não compila:
    - `byte valor = 128;` - ultrapassa o valor máximo aceito

- **short**
    - Compila:
        - `short maiorValor = 32767;` - maior valor aceito
    - Não compila:
        - `short valor = 32768;` - ultrapassa o valor máximo aceito

- **int**
    - Compila:
        - `int populacaoCidade = 754_264;` - valor aceito
        - `int valorMaximoAceito = 2_147_483_647;` - valor máximo aceito
    - Não compila:
        - `int valorMaximoAceito = 2_147_483_648;` - não compila

- **long**
    - Compila:
        - `long populacaoCidade = 754_264L;` - valor aceito
        - `long valorMaximoAceito = 2_147_483_647L;` - valor aceito
        - `long valorMaximoAceito2 = 2_147_483_648L;` - valor aceito
    - Não compila:
        - `long valorMaximoAceito = 2_147_483_648;` - não compila
    - Se não colocarmos o `L` após o valor do tipo long, o Java entende que é um inteiro.

- **double**
    - armazenam valores com casas decimais
    - Compila:
        - `double pesoRaphael = 85.4;` - valor aceito
        - `double pesoRodrigo = 85.4d;` - valor aceito (repare no `d` indicando que é um double)

- **float**
    - armazenam valores com casas decimais
    - mais preciso que o tipo `float`
    - Compila:
        - `float minhaTaxa = 3_223.43f;` - valor aceito
        - `float pesoRodrigo = 85.4d;` - valor aceito (repare no `d` indicando que é um double)
    - Não Compila:
      - `float minhaTaxa = 3_223.43;` - ele tentará converter para double

- Não usar float e double para usar programas com operações financeiras.
- Poderia perder precisão de valores.
- Existem outros tipos mais indicados.