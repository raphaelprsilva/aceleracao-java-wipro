# Packages Challange

Crie um pacote com o nome adequado contendo uma classe chamada Series com os seguintes métodos estáticos:

- `nSum(int n)` retorna a soma de todos os números de `0` a `n`.
  - Os 10 primeiros números são: 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.

- `factorial(int n)` retorna o produto de todos os números de `1` a `n`, ou seja, 1 * 2 * 3 * 4 ... * (n - 1) * n.
  - Os primeiros 10 fatoriais são: 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.

- `fibonacci(int n)` retorna o enésimo número de Fibonacci.
  - Estes são definidos como:
    ```
    f(0) = 0
    f(1) = 1
    f(n) = f(n-1) + f(n-2)
    ```
    então `f(2)` também é 1.
  - Os primeiros 10 números de Fibonacci são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

Quando você tiver testado suas funções, exclua a classe `Main` e produzir um arquivo `jar`.

Crie um novo projeto e adicione sua biblioteca `Series`, depois teste os três métodos no método `main()` do seu novo projeto.