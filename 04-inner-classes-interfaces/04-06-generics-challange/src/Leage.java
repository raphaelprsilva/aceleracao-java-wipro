import java.util.ArrayList;
import java.util.Collections;

public class Leage<T extends Team> {
  public String name;
  private ArrayList<T> leage = new ArrayList<>();

  public Leage(String name) {
    this.name = name;
  }

  public boolean add(T team) {
    if (this.leage.contains(team)) {
      return false;
    }
    leage.add(team);
    return true;
  }

  public void showLeageTable() {
    Collections.sort(this.leage);
    for (T team : leage) {
      System.out.println(team.getName() + ": " + team.ranking());
    }
  }
}
