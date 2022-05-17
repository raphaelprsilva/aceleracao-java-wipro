public class Main {
  public static void main(String[] args) {
    // Aqui, estamos adicionando uma liga com o tipo Team, que por sua vez, possui o tipo FootballPlayer
    Leage<Team<FootballPlayer>> brasileirao = new Leage<>("Brasileirão");

    // Cria times de futebol
    Team<FootballPlayer> saoPaulo = new Team<>("São Paulo");
    Team<FootballPlayer> flamengo = new Team<>("Flamengo");
    Team<FootballPlayer> corinthians = new Team<>("Corinthians");
    Team<FootballPlayer> cruzeiro = new Team<>("Cruzeiro");

    // Cria time de volei
    Team<VoleyBallPlayer> praiaClube = new Team<>("Praia Clube");

    // Cria jogadores de futebol
    FootballPlayer romario = new FootballPlayer("Romário");
    FootballPlayer bebeto = new FootballPlayer("Bebeto");

    // Adiciona jogadores aos times
    saoPaulo.addPlayer(bebeto);
    flamengo.addPlayer(romario);

    // Adiciona times à liga
    brasileirao.add(saoPaulo);
    brasileirao.add(flamengo);
    brasileirao.add(corinthians);
    brasileirao.add(cruzeiro);

    // Se eu tentar adicionar na liga, um time de volei, eu obterei um erro de compilação.
    // brasileirao.add(praiaClube);

    // Resultados de jogos
    flamengo.matchResult(saoPaulo, 3, 2);
    flamengo.matchResult(corinthians, 4, 0);
    corinthians.matchResult(saoPaulo, 1, 0);
    cruzeiro.matchResult(saoPaulo, 0, 0);
    corinthians.matchResult(cruzeiro, 0, 2);
    cruzeiro.matchResult(flamengo, 1, 2);

    brasileirao.showLeageTable();
  }
}
