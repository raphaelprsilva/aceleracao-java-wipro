public class Pinguin extends Bird {
  public Pinguin(String name) {
    super(name);
  }

  @Override
  public void fly() {
    super.fly();
    System.out.println("Eu não sou muito bom nisso. Posso ir nadando?");
  }
}
