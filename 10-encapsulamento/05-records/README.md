# Records

O `records` nos ajuda na criação de classes imutáveis.

Exemplo:

```java
public record Horario(int hora, int minuto) {
  // vamos somente validar os atributos na instanciação do objeto
  // esse é um construtor padrão de um record
  public Horario {
    if (hora < 0 || hora > 23) {
      throw new IllegalArgumentException("Hora inválida");
    }
    if (minuto < 0 || minuto > 59) {
      throw new IllegalArgumentException("Minuto inválido");
    }
  }

  // podemos criar métodos
  public String formatar() {
    // hora() é um getter
    // minuto() é um setter
    return String.format("%02d:%02d", hora(), minuto());
  }
}
```

A instanciação de um `Record` é feita da mesma maneira.

Os `records` facilitam a vida, pois:

- Já são criadas os atributos de instância `private` e `final`
- Já são criados os métodos `getters` e `setters` para os atributos
- Já é criado o construtor com os parâmetros