# Sobrecarga de Métodos (Overloading)

É possível criar vários métodos em uma classe com o mesmo nome. Porém, a quantidade ou os tipos dos parâmetros deve ser diferente.

Isso se chamada _Overloading_ ou sobrecarga de métodos.

Isso é bastante utilizado quando precisamos de um mesmo método, mas com comportamentos diferentes.

Um exemplo disso é o método de printar na tala, o `System.out.println()`. Ele pode receber diferentes tipos de parâmetros
e funciona assim mesmo, ou seja, ele têm vários comportamentos e aceita os mais diversos tipos de parâmetros.

Vamos para um exemplo:

```java
public class CadastroPortaria {
  final static int TEMPO_PADRAO_EXPIRACAO_EM_MESES = 1;

  // repare no nome do método e nos parâmetros
  void cadastrar(final Visitante visitante) {
    this.cadastrar(visitante, TEMPO_PADRAO_EXPIRACAO_EM_MESES);
  }
  
  void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
    final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

    System.out.printf("Visitante %s cadastrado para %d dias.%n", visitante.nome, tempoExpiracaoEmDias);
  }
}
```

No exemplo acima, fizemos uma sobrecarga.