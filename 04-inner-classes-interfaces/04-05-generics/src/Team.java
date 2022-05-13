import java.util.ArrayList;

public class Team {
  private final String name;
  int played = 0;
  int won = 0;
  int lost = 0;
  int tied = 0;

  private ArrayList<Player> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean addPlayer(Player player) {
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

  public void matchResult(Team otherTeam, int ourScore, int theirScore) {
    if (theirScore > ourScore) {
      this.lost += 1;
    } else if (ourScore > theirScore) {
      this.won += 1;
    } else {
      this.tied += 1;
    }
    this.played += 1;

    if (otherTeam != null) {
      otherTeam.matchResult(null, theirScore, ourScore);
    }
  }

  public int ranking() {
    return (this.won * 2) + tied;
  }
}
