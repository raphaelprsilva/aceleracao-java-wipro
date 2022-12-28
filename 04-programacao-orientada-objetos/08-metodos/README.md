# Criando e Invocando um método

Os métodos são funções declaradas dentro de uma classe para poder fazer algo.

Mas o que seria, fazer algo? Na nossa classe `Carro` por exemplo, podemos ter vários
métodos que:

- Calcula a velocidade do carro;
- Calcula a depreciação do carro;
- Calcula o valor de revenda do carro;

Um método tem que ter:

- o tipo de retorno;
- pode ter parâmetros ou não;

A sintaxe seria algo assim:

```
tipoRetornoMetodo nomeMetodo (parametro1: tipoParametro1, parametro2: tipoParametro2) {
  // expressão do método, ou seja, o que ele se propõe a fazer
}
```

Vamos para o nosso exemplo:

```java
public class Carro {
  String fabricante;
  String modelo;
  String cor;
  double precoCompra;
  int anoFabricacao;
  Pessoa proprietario;
  
  // void - significa que o método não retorna nada
  void calcularValorRevenda() {
    // o escopo dessa variável é apenas dentro do método
    int tempoDeUsoEmAnos = 2022 - anoFabricacao;
    int vidaUtilEmAnos = 20;
    double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);
    
    if (valorRevenda < 0) {
      valorRevenda = 0;
    }

    System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
    System.out.printf("Valor da Revenda: %6.2f%n", valorRevenda);
  }
}
```

É importante ressaltar algumas coisas:

- Dar nome de métodos na função imperativa:
  - `calcularVelocidadeCarro`
  - `fazerRequisicao`
  - `calcularRotacaoMotor`

Vamos melhorar nosso método `calcularValorRevenda`:

```java
public class Carro {
  String fabricante;
  String modelo;
  String cor;
  double precoCompra;
  int anoFabricacao;
  Pessoa proprietario;

  int calcularTempoDeUsoEmAnos() {
    return 2022 - anoFabricacao;
  }

  // double - significa que o método retorna um double
  double calcularValorRevenda() {
    // o escopo dessa variável é apenas dentro do método
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
    int vidaUtilEmAnos = 20;
    double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

    if (valorRevenda < 0) {
      valorRevenda = 0;
    }

    return valorRevenda;
  }
}
```