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


## Cuidados ao usar o varargs

Quando se usa `varargs` em um método, o argumento que usa este não é obrigatório. Como assim?

Veja o exemplo abaixo:

```java
public class ServicoCobranca {
  //                                  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  void pagar(Fatura fatura, String... emailsCobranca) {
    // emailsCobranca é um array
    System.out.printf("A fatura de número %d, no valor total de R$ %.2f foi paga.%n", fatura.numero, fatura.valorTotal);

    for (String email : emailsCobranca) {
      System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
  }
}
```

No exemplo acima, `emailsCobranca` não é obrigatório. Se eu chamar o método sem ele, vou obter um erro só na execução. Na compilação não teremos nada.

Isso é um problema.

Veja:

```java
public class Main {
  public static void main(String[] args) {
    Fatura fatura = new Fatura();
    fatura.numero = 123;
    fatura.valorTotal = 1_345.23;

    ServicoCobranca servicoCobranca = new ServicoCobranca();

    // Gera erro de execução. Na compilação passa tranquilamente
    servicoCobranca.pagar(fatura);
  }
}
```

Como resolver isso?

Adicionando um parâmetro a mais no método. Esse parâmetro irá ser obrigatório ao chamar o método e
irá gerar um erro durante a compilação, caso não seja passado.

Veja:

```java
import java.util.Objects;

public class ServicoCobranca {
  //  novo parâmetro adicionado    ↓↓↓↓↓↓↓↓↓↓↓↓↓
  void pagar(Fatura fatura, String emailCobranca, String... emailsCobranca) {
    // Obriga a passagem os parâmetros
    Objects.requireNonNull(emailCobranca, "Informe o email de cobrança");
    Objects.requireNonNull(fatura, "Informe a fatura");

    System.out.printf("A fatura de número %d, no valor total de R$ %.2f foi paga.%n", fatura.numero, fatura.valorTotal);

    this.enviarNotificacao(fatura, emailCobranca);

    for (String email : emailsCobranca) {
      this.enviarNotificacao(fatura, email);
    }
  }

  // criamos um método privado para notificação
  private void enviarNotificacao(Fatura fatura, String email) {
    System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
  }
}
```