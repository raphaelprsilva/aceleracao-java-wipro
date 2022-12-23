# Formatando Saída

Usaremos agora um método chamado `printf`. Ele é responsável por imprimir na tela, informações formatadas.

Exemplo:

```java
class FormatComPrintf {
    public static void main(String[ ] args) {
        String name = "Raphael";
        System.out.printf("Hello %s%n", name);

        int price = 39;
        System.out.printf("Price: %d items%n", price);

        double height = 1.87;
        System.out.printf("Height: %.2f meters%n", height);
    }
}
```

> **`%s`** - Esse elemento é responsável por printar uma string 

> **`%n`** - Esse elemento é responsável por pular uma linha

> **`%d`** - Esse elemento é responsável por printar elementos inteiros

> **`%f`** - Esse elemento é responsável por printar elementos ponto flutuantes.
> O `.2` indica que queremos imprimir com uma precisão de duas casas decimais do valor.