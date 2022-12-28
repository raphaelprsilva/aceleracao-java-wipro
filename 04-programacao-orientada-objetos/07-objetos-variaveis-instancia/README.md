# Inicializando objetos em variáveis de instância

Imagine que nós temos a classe `Carro`, conforme abaixo:

```java
public class Carro {
  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  Proprietario proprietario;
}
```

Se por ventura, no momento em que eu criar um objeto do tipo `Carro`, eu tentar acessar a propriedade `name` do proprietário sem ter inicializado, eu receberei uma exceção no console.

```java
public class Main {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();
    
    meuCarro.fabricante = "Fordy";
    meuCarro.anoFabricacao = 2020;

    System.out.println(meuCarro.fabricante); // Fordy
    System.out.println(meuCarro.cor); // null
    System.out.println(meuCarro.proprietario.nome); // exceção é lançada aqui
  }
}
```

Mas, se instanciar o objeto `proprietario` na classe `Carro`, o erro deixa de ser lançado, e então recebo um `null`.

```java
public class Carro {
  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  Proprietario proprietario = new Proprietario(); // instanciei um novo objeto
}
```

Na classe `Main`:

```java
public class Main {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();
    
    meuCarro.fabricante = "Fordy";
    meuCarro.anoFabricacao = 2020;

    System.out.println(meuCarro.fabricante); // Fordy
    System.out.println(meuCarro.cor); // null
    System.out.println(meuCarro.proprietario.nome); // null
  }
}
```