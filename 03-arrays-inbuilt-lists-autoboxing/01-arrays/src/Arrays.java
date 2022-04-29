public class Arrays {
  public static void main(String[] args) {
    // Array de Inteiros

    // 1 - Maneira de inicializar um array
    // int[] myIntArray = new int[10]; // estamos criando um array que cabem 10 variáveis

    // 1 - Essa é uma maneira de atribuir valores a um array
    // myIntArray[0] = 23;
    // myIntArray[1] = 432;
    // myIntArray[5] = 50;

    // 2 - Maneira de inicializar um array
    // int[] myIntArray = {23, 432, 54, 23, 64, 63, 8, 31, 5, 98};

    // 3 - Maneira de inicializar um array (usando for loop)
    int[] myIntArray = new int[10];

    for (int index = 0; index < myIntArray.length; index += 1) {
      myIntArray[index] = index * 10;
    }

    // Imprimindo o array no console
    System.out.println("myIntArray: " + java.util.Arrays.toString(myIntArray));

    // Array de Doubles
    double[] myDoubleArray = new double[10];
  }
}
