# Palavras Reservadas

- Em toda linguagem existem palavras reservadas.
- São palavras que a própria linguagem usa para definir processos e executar ações.
- Não é possível usar o nome de uma variável, classe ou método com tais palavras.
- Algumas palavras reservadas:
  - `abstract`
  - `if`
  - `private`
  - `this`
  - `double`
  - `implements`
  - `throw`
  - `boolean`
  - `else`
  - `import`
  - `public`
  - `throws`
  - `break`
  - `return`
  - `byte`
  - `extends`
  - `int`
  - `short`
  - `true`
  - `false`
  - `case`
  - `interface`
  - `static`
  - `try`
  - `catch`
  - `final`
  - `long`
  - `void`

Tente usar uma palavra reservada em seu código e tente compilá-lo para ver o resultado.

```java
// Arquivo OlaMundo.java
public class short {
  public static void main(String[] args) {
    System.out.println("Olá Mundo");
  }
}
```

Tentando compilar o código com `java OlaMundo.java`:

Resultado:

```shell
OlaMundo.java:1: error: <identifier> expected
public class short {
            ^
OlaMundo.java:2: error: class, interface, enum, or record expected
	public static void main(String[] args) {
	              ^
OlaMundo.java:4: error: class, interface, enum, or record expected
	}
	^
3 errors
error: compilation failed
```