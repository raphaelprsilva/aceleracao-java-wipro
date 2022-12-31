# Boas Práticas - Prefira Tipos Primitivos à Wrappers

Prefira usar isso:

```java
int numero1 = 128;
int numero2 = 128;
```

Do que isso:

```java
Integer numero1 = 128;
Integer numero2 = 128;
```

### Comparando Wrappers:

Prefira isso:

- Pois a comparação é feita sobre os valores dos objetos na memória.

```java
Integer numero1 = 128;
Integer numero2 = 128;

// maneira 1
numero1.equals(numero2);

// maneira 2;
numero1.compareTo(numero2) == 0;
```

Não use isso:

- Pois a comparação é feita sobre a referência do objeto na memória, e não sobre os valores.

```java
Integer numero1 = 128;
Integer numero2 = 128;

numero1 == numero2;
```

### Quando usar tipos primitivos e quando usar Wrappers?

- Não se preocupe em otimizar prematuramente seu código
- Dê preferência pelos tipos primitivos
  - Eles são mais rápidos e simples
- Use tipos Wrappers quando você precisar que um tipo seja null
  - Aí nesse caso não é possível usar um tipo primitivo

Imagine essa classe:

```java
public class Cliente {
  String nome;
  Integer idade;
  Double rendaMensal;
  int pontosCartaoFidelidade;
  boolean ativo;
}
```

Vamos analisar:

- Atributo `idade`:
  - Faz sentido que seja do tipo wrapper, pois se eu não tiver a idade do cliente, ele será inicializado com `null`
  - Se eu colocasse `int idade`, e por algum motivo eu não tiver a idade do cliente, o valor padrão seria `0`;

- Atributo `rendaMensal`:
  - Faz sentido que seja wrapper, pois se eu não tiver a renda mensal do cliente, ele será inicializado com `null`
  - Se eu colocasse `double rendaMensal`, e por algum motivo eu não tiver a renda mensal do cliente, o valor padrão seria `0.0`, o que não faz sentido;

- Atributo `pontosCartaoFidelidade`:
  - Faz sentido que seja um tipo primitivo, pois se o cliente ainda não tiver pontos, ele será inicializado com o valor `0`;
  - Mas também poderia ser um tipo Wrapper, sem perca de sentido;

- Atributo `ativo`:
  - Faz sentido que seja primitivo, pois ou a variável será por padrão `false`, a não ser que você o defina como `true`;