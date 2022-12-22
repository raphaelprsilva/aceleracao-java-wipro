public class OperadoresAritmeticos {
  public static void main(String[] args) {
    int minhaIdade = 40;
    int suaIdade = 25;

    // adição
    int somaDasIdades = minhaIdade + suaIdade;
    System.out.println("Soma das idades:" + somaDasIdades);

    // subtração
    int diferencaDasIdades = minhaIdade - suaIdade;
    System.out.println("Diferença das idades:" + diferencaDasIdades);

    // multiplicação
    int multiplicacaoDasIdades = minhaIdade * suaIdade;
    System.out.println("Multiplicação das idades:" + multiplicacaoDasIdades);

    // divisão
    int metadeDaSuaIdade = suaIdade / 2; // Resultado = 12 -> Isso acontece pois a variável foi declarada como inteiro
    System.out.println("Metade da idade:" + metadeDaSuaIdade);

    // Módulo
    int restoDaDivisao = 8 % 3;
    System.out.println("Resto da divisão de 8 por 3 = " + restoDaDivisao);
  }
}