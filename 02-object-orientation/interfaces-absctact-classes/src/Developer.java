public abstract class Developer {
  protected String language;
  protected int yearsOfExperience;

  public Developer(String language, int yearsOfExperience) {
    this.language = language;
    this.yearsOfExperience = yearsOfExperience;
  }

  public abstract double wage();

  public abstract String mainSkill();
}
