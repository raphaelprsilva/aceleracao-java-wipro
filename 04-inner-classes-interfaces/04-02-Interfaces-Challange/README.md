# Interface Challange

Crie uma interface simples que permita que um objeto seja salvo em algum tipo de armazenamento.

Implemente o seguinte:

### 1. Interface `ISavable`

- Tem dois métodos:

    - `write()`, não recebe argumentos e retorna uma lista contendo objetos do tipo `String`.
    - `read()`, pega uma lista do tipo `String` e não retorna nada.

### 2. Classe `Player`

- Tem quatro atributos:

    - Duas `Strings` chamadas `name` e `weapon`
    - Dois `ints` chamados `hitPoints` e `strength`

- Tem um `constructor` que aceita uma `String` (`name`) e dois inteiros (`hitPoints` e `strength`). Ele inicaliza `name`, `hitPoints` e `strength` com os valores passados. Inicializa weapon com o valor default de "`Sword`".

- Tem onze métodos:

    - `Getters` e `Setters` para todos os quatro atributos.
    - `write()`, igual à `interface`. Retorna uma Lista dos campos na ordem em que aparecem em `toString()`.
    - `read()`, o mesmo que `interface`. Armazena os valores na Lista, na ordem em que aparecem em `toString()`. Certifique-se de que `List` não seja **nulo** e que `size()` seja maior que `0` antes de armazenar os valores.
    - `toString()`, `Players` que sobrescreve o método `toString()`. **Não aceita** argumentos e retorna uma `String` no seguinte formato:
      - ``` Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'} ```

### Classe `Monster`

- Tem três atributos. Uma `String` chamada `name` e duas `ints` chamadas `hitPoints` e `strength`.
- Um `constructor` que aceita uma `String` (`name`) e dois `ints` (`hitPoints` e `strength`). Ele inicializa o `name`, os `hitPoints` e a `strength` com os valores recém-passados.
- E seis métodos:

    - Apenas `getters` para os três atributos.
    - `write()`, igual à `interface`. Retorna uma lista dos atributos na ordem em que aparecem em `toString()`.
    - `read()`, o mesmo que `interface`. Armazena os valores na Lista, na ordem em que aparecem em `toString()`. Certifique-se de que List **não seja nulo** e que `size()` seja maior que `0` antes de armazenar os valores.
    - `toString()`, `Monsters` substituindo o método `toString()`. **Não aceita argumentos** e retorna uma `String` no seguinte formato:
        - ``` Monster{name='Werewolf', hitPoints=20, strength=40} ```

> **Dica**: `Player` and `Monster` precisam implementar `ISaveable`.

> **Dica**: Tenha muito cuidado com a grafia dos nomes dos campos, construtores e métodos.

> **OBSERVAÇÃO**: Todos os campos são privados.

> **OBSERVAÇÃO**: Ambos os construtores são públicos.

> **OBSERVAÇÃO**: todos os métodos são públicos.

> **OBSERVAÇÃO**: Não há membros estáticos.