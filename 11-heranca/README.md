# 11. 💰 Herança

Neste capítulo, vamos aprender sobre herança, que é um dos pilares da orientação a objetos. Vamos ver como criar classes filhas a partir de classes pai, como sobrescrever métodos e como utilizar o conceito de polimorfismo.

Para isso, vamos usar um pequeno projeto de banco como exemplo.

A estrutura inicial é:

```
src/
├── br/
│   └── com/
│       └── elraphael/
│           └── banco/
│               ├── Conta.java
│               └── Titular.java
└── Main.java          
```

## Classes Etiquetadas (tagged class)

Vamos supor que temos vários tipos de contas, e que estas serão rotuladas/etiquetadas por um
atributo chamado `tipo`, que irá definir qual o tipo de conta.

Poderíamos usar `enums`, mas como ainda não temos conhecimento. Vamos usar essas variáveis.

Veja o código da classe `Conta`. Você verá que ao criarmos uma classe dessa maneira, fazemos com que:

- O código seja de difícil manutenabilidade
- Várias condicionais dependendo do tipo de conta
- Maior uso de memória
- Imagine se tivéssemos outros tipos de contas bancárias
- Então, essa não é uma boa prática

## Duplicando classes e Isolando comportamentos

Agora vamos criar outras classes, tais como: `ContaEspecial` e `ContaInvestimento`. Além disso,
vamos isolar suas responsabilidades.

Mas, criando essas outras duas classes, vamos percebendo que também estamos duplicando muito código.

Existe muita coisa em comum em ambas as classes de conta.

Agora imagine novamente se tivéssemos novos tipos de conta?

Podemos resolver isso com **Herança**!