# 💶 Promoção Aritmética

Quando realizamos operações aritméticas entre tipos diferentes, o valor final terá o tipo da variável com maior capacidade de armazenamento.

```java
int x = 2;
long y = 10;

int z = x * y; // isso gerará um erro de compilação
```

Alterando o tipo da variável `z`:

```java
int x = 2;
long y = 10;

long z = x * y; // compila
```

Isso significa que, se faço uma operação:

- int * double = double
- float * long = long
- short * int = int
- long * float = float (pois float é ponto flutuante)
- long * double = double (pois double é ponto flutuante)

E assim por diante...