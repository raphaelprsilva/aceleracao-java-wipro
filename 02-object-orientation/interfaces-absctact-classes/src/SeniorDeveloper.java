public class SeniorDeveloper extends Developer {
  public SeniorDeveloper(String language, int yearsOfExperience) {
    super(language, yearsOfExperience);
  }

  @Override
  public double wage() {
    return 5000.0 + (yearsOfExperience * 500);
  }

  @Override
  public String mainSkill() {
    return language + " Debug";
  }
}
