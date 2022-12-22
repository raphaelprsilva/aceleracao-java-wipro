# Operadores de Incremento e Decremento

Existem operadores que facilitam a vida, quando é necessário incrementar ou decrementar uma variável em uma unidade.

São eles:
- O operador `++`
  - Este incrementa a variável em uma unidade
- O operador `--`
  - Este decrementa a variável em uma unidade

Veja o exemplo abaixo:

```java
public class OperadorIncremento {
  public static void main(String[] args) {
    int totalDeExerciciosFeitos = 5;

    /*
      Suponha que você fez mais um exercício, ou seja, você
      precisa incrementar sua variável.
      Para isso, temos 3 possibilidades
     */
    
    // 1ª possibilidade
    // totalDeExerciciosFeitos = totalDeExerciciosFeitos + 1;

    // 2ª possibilidade
    // totalDeExerciciosFeitos += 1;

    // 3ª possibilidade (nosso foco)
    totalDeExerciciosFeitos++;

    System.out.println("Total de Exercícios feitos: ", totalDeExerciciosFeitos);
  }
}
```

Os operadores também podem ser classificados em **pré-fixados** e **pós-fixados**:

Vamos ver um exemplo (foque na parte não comentada do código):

```java
public class OperadorIncremento {
  public static void main(String[] args) {
    int totalDeExerciciosFeitos = 5;

    int novoTotalDeExerciciosFeitos = totalDeExerciciosFeitos++;

    System.out.println("Total de Exercícios feitos: " + totalDeExerciciosFeitos);
    System.out.println("Novo Total de Exercícios feitos: " + novoTotalDeExerciciosFeitos);
  }
}
```

Rodando o arquivo (`java OperadorIncremento.java`), teremos o resultado:

```shell
Total de Exercícios feitos: 6
Novo Total de Exercícios feitos: 5
```

Isso acontece pois, primeiro é atribuído o valor de `totalDeExerciciosFeitos` à `novoTotalDeExerciciosFeitos` e depois é feito o incremento na variável `totalDeExerciciosFeitos`.

Para que seja feita a atribuição, pré-fixada (antes), precisamos fazer assim:

```java
public class OperadorIncremento {
  public static void main(String[] args) {
    int totalDeExerciciosFeitos = 5;

    int novoTotalDeExerciciosFeitos = ++totalDeExerciciosFeitos;

    System.out.println("Total de Exercícios feitos: " + totalDeExerciciosFeitos);
    System.out.println("Novo Total de Exercícios feitos: " + novoTotalDeExerciciosFeitos);
  }
}
```

Rodando o arquivo (`java OperadorIncremento.java`), teremos o resultado:

```shell
Total de Exercícios feitos: 6
Novo Total de Exercícios feitos: 6
```

A mesma analogia pode ser feita para decremento.