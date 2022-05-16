import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    FootballPlayer romario = new FootballPlayer("Romario");
    VoleyballPlayer giba = new VoleyballPlayer("Giba");
    BaseballPlayer pat = new BaseballPlayer("Pat");

    Team<FootballPlayer> flamengo = new Team<>("Flamengo");
    flamengo.addPlayer(romario);
    flamengo.getNumberOfPlayers();

    Team<BaseballPlayer> aligators = new Team<>("Aligators");
    aligators.addPlayer(pat);

    Team<VoleyballPlayer> minas = new Team<>("Minas");
    minas.addPlayer(giba);

    // flamengo.matchResult(minas, 3, 1);

  }
}
