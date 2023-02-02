# Use interfaces apenas para definir tipos

O uso de interfaces é muito comum em linguagens fortemente tipadas, como Java e C#.

Existem interfaces que podem ser usadas apenas para definir tipos, como a interface abaixo:

```java
public interface TempoConstants {
    int SEGUNDOS_POR_MINUTO = 60;
    int SEGUNDOS_POR_HORA = 3600;
    int SEGUNDOS_POR_DIA = 86400;
}
```

Mas ao fazer isso, você está criando uma interface que não possui nenhum método. Isso pode ser confuso para outros desenvolvedores que forem ler o seu código.

Se você precisa definir tipos, use classes. Se você precisa definir tipos e comportamentos, use classes abstratas. Se você precisa definir tipos e comportamentos que podem ser compartilhados por outras classes, use interfaces.

Ao invés de usarmos a interface acima, podemos usar uma classe:

```java
public class TempoConstants {
    public static final int SEGUNDOS_POR_MINUTO = 60;
    public static final int SEGUNDOS_POR_HORA = 3600;
    public static final int SEGUNDOS_POR_DIA = 86400;
    
    private TempoConstants() {
        // Classe utilitária, não deve ser instanciada
    }
}
```