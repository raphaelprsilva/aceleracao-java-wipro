# Banking Challange

Seu trabalho é criar um aplicativo bancário simples.

Implemente as seguintes classes:

### 1. `Bank`

- Possui dois campos, uma `String` chamada `name` e um `ArrayList` que contém objetos do tipo `Branch` chamados `branches`.

- Um construtor que recebe uma `String` (**nome do banco**). Ele inicializa o nome e instancia branches.

- E **cinco métodos**, são eles (**suas funções estão em seus nomes**):

  - `addBranch()`, tem **um** parâmetro do tipo `String` (**nome da branch**) e retorna um `boolean`. Ele retorna `true` se a `branch` foi adicionada com sucesso ou `false` caso contrário.

  - `addCustomer()`, possui **três** parâmetros do tipo `String` (**nome da filial**), `String` (**nome do cliente**), `double` (**transação inicial**) e retorna um `boolean`. Retorna `true` se o cliente foi adicionado com sucesso ou `false` caso contrário.

  - `addCustomerTransaction()`, possui **três** parâmetros do tipo `String` (**nome da filial**), `String` (**nome do cliente**), `double` (**transação**) e retorna um `boolean`. Retorna `true` se a transação do cliente foi adicionada com sucesso ou `false` caso contrário.

  - `findBranch()`, possui **um** parâmetro do tipo `String` (**nome da Branch**) e retorna uma `Branch`. Retorna a `Branch` se existir ou `null` caso contrário.

  - `listCustomers()`, possui **dois** parâmetros do tipo `String` (**nome da Branch**), `boolean` (**imprime transações**) e retorna um `boolean`. Retorna `true` se a `branch` existir ou `false` caso contrário. Este método imprime uma lista de clientes.

> **DICA 1**: Em `Bank`, use o método `findBranch()` em cada um dos outros quatro métodos para validar uma `branch`. Faça a mesma coisa na `Branch` com `findCustomer()` - exceto pelos dois getters.

### Código para o teste

~~~java
Bank bank = new Bank("Banco da Márcia");

bank.addBranch("Brasilia");

bank.addCustomer("Brasilia", "Tim", 50.05);
bank.addCustomer("Brasilia", "Mike", 175.34);
bank.addCustomer("Brasilia", "Percy", 220.12);

bank.addCustomerTransaction("Brasilia", "Tim", 44.22);
bank.addCustomerTransaction("Brasilia", "Tim", 12.44);
bank.addCustomerTransaction("Brasilia", "Mike", 1.65);

bank.listCustomers("Brasilia", true);

~~~

### Saída

A lista de clientes deve ser impressa no seguinte formato se o parâmetro booleano for verdadeiro:

~~~text
Detalhes do cliente para a filial Brasilia
Cliente: Tim[1]
Transações
[1] Valor 50,05
[2] Valor 44,22
[3] Valor 12,44
Cliente: Mike[2]
Transações
[1] Valor 175,34
[2] Valor 1,65
Cliente: Percy[3]
Transações
[1] Valor 220,12
~~~

e se `false`, apenas os clientes - sem transações:

~~~java
bank.listCustomers("Brasilia", false);

Detalhes do cliente para a filial Brasilia
Cliente: Tim[1]
Cliente: Mike[2]
Cliente: Percy[3]
~~~

### 2. `Branch`

- Tem **dois** campos, uma `String` chamada `name` e uma `ArrayList` que contém objetos do tipo `Customer` chamados `customers`.

- Um construtor que recebe uma `String` (**nome da branch**). Ele inicializa o `name` e instancia os `customers`.

- E **cinco** métodos, eles são (**suas funções estão em seus nomes**):

  - `getName()`, getter para `name`.

  - `getCustomers()`, getter para `customers`.

  - `newCustomer()`, possui **dois** parâmetros do tipo `String` (**nome do cliente**), `double` (**transação inicial**) e retorna um `boolean`. Retorna `true` se o cliente foi adicionado com sucesso ou `false` caso contrário.

  - `addCustomerTransaction()`, possui **dois** parâmetros do tipo `String` (**nome do cliente**), `double` (`transaction`) e retorna um `boolean`. Retorna `true` se a transação do cliente foi adicionada com sucesso ou `false` caso contrário.

  - `findCustomer()`, tem um parâmetro do tipo `String` (**nome do cliente**) e retorna um `Customer`. Retorne `Customer` se ele existir e `null`, caso contrário.

### 3. `Customer`

-  Possui **dois** campos, uma `String` chamada `name` e uma `ArrayList` que contém objetos do tipo `Double` chamados `transactions`.

-  Um construtor que recebe uma `String` (**nome do cliente**) e um `double` (**transação inicial**). Ele inicializa o `name` e instancia as `transactions`.

-  E **três** métodos, eles são (**suas funções estão em seus nomes**):

-  `getName()`, getter para `name`.

-  `getTransactions()`, getter para `transactions`.

-  `addTransaction()`, tem um parâmetro do tipo `double` (`transaction`) e não retorna nada.

> **DICA 2**: Em `Customer`, pense no que mais você precisa fazer no construtor ao instanciar um objeto `Customer`.

> **DICA 3**: Pense em quais métodos você precisa chamar de outra classe ao implementar um método.

> **DICA 4**: Tenha muito cuidado com a grafia dos nomes dos campos, construtores e métodos.

> **DICA 5**: Seja extremamente cuidadoso com espaços e ortografia na saída impressa.

**OBSERVAÇÃO**: Todas as transações (`transactions`) são depósitos (sem saques/saldos).

**OBSERVAÇÃO**: Todos os campos são **privados**.

**OBSERVAÇÃO**: todos os construtores são **públicos**.

**OBSERVAÇÃO**: todos os métodos são **públicos** (exceto `findBranch()` e `findCustomer()`, que são **privados**).

**OBSERVAÇÃO**: Não há membros estáticos.
