# 8. 🧠 Gerenciamento de Memória

<details>
  <summary><ins>Memória Heap da JVM</ins></summary>

- Este é um conceito abstrato;
- Não existe um componente físico `heap` localizado na memória;
- É a área de memória onde os objetos que nós instanciamos com o operador `new` são alocados.
- Apenas objetos criados a partir de classes são alocados na memória `heap`, ou seja, objetos com semântica de
  referência;

</details>

<details>
  <summary><ins>Call Stack, Stack Memory e Heap Memory</ins></summary>

- **Call Stack** (pilha de chamadas)
    - Quando um método de uma classe chama outro método, que por sua vez chama outro, é criada uma pilha (sequência) de
      chamadas;
    - Exemplo: Método `main` chama o Método `metodo1` que chama o método `metodo2`;
    - Então temos uma sequência: `main` → `metodo1` → `metodo2`;
    - Tipos primitivos são salvos na `Call Stack`;
    - Objetos instanciados não ficam salvos nessa pilha;

- **Garbage Collector**
    - Quando um objeto instanciado perde a sua referência na `Memória Heap`, ele é removido;

</details>

<details>
  <summary><ins>Informações da Memória Heap com a Runtime API</ins></summary>

- A JVM pode usar determinada quantidade de memória quando está executando algum programa;
- Para saber qual o máximo de memória a JVM pode usar, basta:

```java
public class Main {
  public static void main(String[] args) {
    int maxMemory = Runtime.getRuntime().maxMemory();
    int maxMemoryInMegaBytes = maxMemory / 1024d / 1024d;
    System.out.printf("Máxima Memória Disponível para JVM: %d MB%n", maxMemoryInMegaBytes);

    int totalMemory = Runtime.getRuntime().totalMemory();
    int totalReservedMemoryToJVM = totalMemory / 1024d / 1024d;
    System.out.printf("Total de memória reservada pela JVM: %d MB%n", totalReservedMemoryToJVM);

    int totalAvailable = Runtime.getRuntime().freeMemory();
    int totalAvailableMemoryToJVM = totalAvailable / 1024d / 1024d;
    System.out.printf("Total de memória disponível pela JVM: %d MB%n", totalAvailableMemoryToJVM);
  }
}
```
</details>

<details>
  <summary><ins>Garbage Collector</ins></summary>

- É um mecanismo que roda dentro da JVM que coleta os objetos que não estão sendo mais referenciados;
- Aqueles que não estão sendo usados são removidos para liberar espaço em memória;
- Isso torna o desenvolvimento de software mais rápido, pois isso é feito automaticamente;
- Esse processo é feito internamente pela JVM;
</details>

<details>
  <summary><ins>Inalcançabilidade de Objetos</ins></summary>

- Quando objetos se tornam inalcançáveis?
  - Quando um objeto é instanciado e em algum momento ele se torna `null`, ele passa a ser inalcançável;
    - `byte[] x = new byte[8 * 1024 * 1024];` e depois `x = null`;
</details>

<details>
  <summary><ins>Boas práticas</ins></summary>

- Pode ser que escrevamos um programa que, de alguma forma, retenham objetos na memória;
- Isso é ruim, pois, se objetos não estão sendo instanciados e referenciados, eles deveriam ser coletados pelo garbage collector;
- Mas pode ser que haja um vazamento de memória por retenção de objetos na memória;
- Elimine objetos não eferenciados e obsoletos;
- Atribua `null` quando e somente quando você perceber que o objeto for ficar retido na memória heap;
</details>