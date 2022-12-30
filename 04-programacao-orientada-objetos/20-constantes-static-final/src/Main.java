public class Main {
  public static void main(String[] args) {
    Visitante novoVisitante = new Visitante();
    novoVisitante.nome = "Raphael";
    novoVisitante.idade = 19;

    novoVisitante.definirAcesso();

    CadastroPortaria cadastroPortaria = new CadastroPortaria();
    cadastroPortaria.cadastrar(novoVisitante, 3);
  }
}
