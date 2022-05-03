import java.util.ArrayList;

// Classe criada para mostrar uma "gambiarra" 😎
class IntClass {
  private int myValue;

  public IntClass(int myValue) {
    this.myValue = myValue;
  }

  public int getMyValue() {
    return myValue;
  }

  public void setMyValue(int myValue) {
    this.myValue = myValue;
  }
}

public class Main {
  public static void main(String[] args) {
    String[] strArray = new String[10];
    int[] intArray = new int[10];

    ArrayList<String> stringArrayList = new ArrayList<String>();
    stringArrayList.add("Rapha");

    // A linha abaixo gera um erro
    // ArrayList<int> ints = new ArrayList<int>();

    // Isso é permitido, mas não é aconselhável
    ArrayList<IntClass> ints = new ArrayList<IntClass>();
    ints.add(new IntClass(54));

    // Classes Wrapper

    // Aqui, ele lança um erro, falando que o 'Boxing' 'new Integer(23)' é desnecessário
    Integer integer = new Integer(23);

    // Assim, nenhum erro é lançado
    Integer integer1 = 24;

    // Aqui, ele lança um erro, falando que o 'Boxing' 'new Double(34.1232)' é desnecessário
    Double doblue1 = new Double(34.1232);

    // Assim, nenhum erro é lançado. Aqui o Java está te ajudando!
    Double double2 = 45.2345;

    // Agora, podemos fazer isso:
    ArrayList<Integer> integers2 = new ArrayList<Integer>();

    // Estamos fazendo um 'boxing', ou seja, estamos "colocando dentro da "caixa" Integer" um inteiro
    for (int index = 0; index < 5; index += 1) {
      integers2.add(Integer.valueOf(index));
    }

    // Aqui, estamos fazendo o 'unboxing', ou seja, estamos "retirando de dentro da classe "Integer"", o valor primitivo
    for (int index = 0; index < 5; index += 1) {
      System.out.println(index + " -> " + integers2.get(index).intValue());
    }

    // Outra maneira... Dá certo e é aconselhável. Aqui, o Java está fazendo o trabalho duro por você.
    Integer myIntValue = 65;

    // Ou... Podemos fazer assim, mas dependendo da IDE, ela vai dizer que é desnecessário fazer isso!
    Integer myIntValue2 = Integer.valueOf(89);

    // Quando fazemos isso:
    int myNewInt = myIntValue2; // É como se o Java fizesse isso: myNewInt.intValue();

    // Exemplo com doubles
    ArrayList<Double> doubles = new ArrayList<Double>();

    for (double index = 0.0; index < 5.0; index += 0.5) {
      doubles.add(index);
    }

    for (int index = 0; index < doubles.size(); index += 1) {
      double value = doubles.get(index).doubleValue();
      System.out.println(index + " --> " + value);
    }
  }
}
