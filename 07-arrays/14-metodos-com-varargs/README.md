# Métodos com `varargs`

O `varargs` é um recurso que foi introduzido na versão 5.0 do Java. Ele permite que um método receba um número variável de argumentos. Por exemplo, imagine que você queira criar um método que receba um número variável de inteiros e retorne a soma deles. Você poderia fazer isso da seguinte forma:

```java
public int soma(int... numeros) {
    int soma = 0;
    for (int numero : numeros) {
        soma += numero;
    }
    return soma;
}
```

No caso acima, o parâmetro `numeros` é um array de inteiros. A chamada do método pode ser feita da seguinte forma:

Assim, um número variável de argumentos pode ser passado para o método. Internamente, o Java cria um array com os valores passados e atribui esse array ao parâmetro `numeros`.

```java
int soma = soma(1, 2, 3, 4, 5);
```

No código temos um exemplo de fatura e serviço de cobrança.

Observação:

- O `varargs` precisa ser sempre o último parâmetro do método.

Para quem usa ou usou o javascript, é semelhante ao spread parameter, que espalha os valores.
