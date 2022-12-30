# Constantes com `static` e `final`

Podemos definir constantes, sim constantes em uma classe.

Isso significa que ela não poderá ser alterada.

Para isso, usamos a palavra reservada `final` unida com a `static`.

Existe uma convenção de que uma constante deve ser:

- Upper Case
- Snake Case

Exemplo:

- `IDADE_MINIMA_PERMITIDA`
- `CONSTANTE_DO_COMPONENTE`
- `PI`

Exemplo:

```java
public class Visitante {
  //               ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  static final int IDADE_MINIMA_PERMITIDA = 18;

  String nome;
  int idade;

  void definirAcesso() {
    // chamando a constante de classe
    //               ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    if (this.idade < Visitante.IDADE_MINIMA_PERMITIDA) {
      System.out.printf("Acesso não permitido para menores de %d anos.%n", Visitante.IDADE_MINIMA_PERMITIDA);
    } else {
      System.out.printf("Acesso librado para %s.%n", this.nome);
    }
  }
}
```

Também é possível definir constantes em métodos. Isso indica que não poderão ser atribuídos outros valores à elas.

```java
public class CadastroPortaria {

  //             ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
  void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
    // se eu tentar fazer isso, vou obter um erro
    // visitante = new Visitante();

    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

    System.out.printf("Visitante %s cadastrado para %d dias.%n", visitante.nome, tempoExpiracaoEmDias);
  }
}
```