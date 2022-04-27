public class JuniorDeveloper extends Developer {
  public JuniorDeveloper(String language, int yearsOfExperience) {
    super(language, yearsOfExperience);
  }

  @Override
  public double wage() {
    return 3000.0 + (yearsOfExperience * 100);
  }

  @Override
  public String mainSkill() {
    return this.language + " Automated tests";
  }
}
