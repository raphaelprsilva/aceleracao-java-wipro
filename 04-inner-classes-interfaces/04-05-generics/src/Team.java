import java.util.ArrayList;

public class Team<T extends Player> {
  private final String name;
  int played = 0;
  int won = 0;
  int lost = 0;
  int tied = 0;

  private ArrayList<T> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean addPlayer(T player) {
    if (members.contains(player)) {
      System.out.println(player.getName() + " is already on this team");
      return false;
    } else {
      members.add(player);
      System.out.println(player.getName() + " added to team " + this.name);
      return true;
    }
  }

  public int getNumberOfPlayers() {
    return this.members.size();
  }

  public void matchResult(Team<T> otherTeam, int ourScore, int theirScore) {
    String message;

    if (theirScore > ourScore) {
      this.lost += 1;
      message = " lost to ";
    } else if (ourScore > theirScore) {
      this.won += 1;
      message = " beat ";
    } else {
      this.tied += 1;
      message = " drew with ";
    }
    this.played += 1;

    if (otherTeam != null) {
      System.out.println(this.getName() + message + otherTeam.getName());
      otherTeam.matchResult(null, theirScore, ourScore);
    }
  }

  public int ranking() {
    return (this.won * 2) + tied;
  }
}
