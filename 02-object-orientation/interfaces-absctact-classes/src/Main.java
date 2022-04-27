public class Main {
  public static void main(String[] args) {
    JuniorDeveloper juniorDeveloper = new JuniorDeveloper("Java", 2);

    System.out.println("junior developer main skill: " + juniorDeveloper.mainSkill());
    System.out.println("junior developer wage: " + juniorDeveloper.wage());

    SeniorDeveloper seniorDeveloper = new SeniorDeveloper("C++", 8);

    System.out.println("senior developer main skill: " + seniorDeveloper.mainSkill());
    System.out.println("senior developer wage: " + seniorDeveloper.wage());
  }
}
