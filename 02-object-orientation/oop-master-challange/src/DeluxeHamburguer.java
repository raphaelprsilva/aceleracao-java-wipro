public class DeluxeHamburguer extends Hamburguer {

  public DeluxeHamburguer() {
    super("Deluxe", "Sausage & Bacon", "Pão branco", 14.54);
    super.addHamburguerAddition1("Chips", 1.25);
    super.addHamburguerAddition2("Drink", 2.5);
  }

  @Override
  public void addHamburguerAddition1(String name, double price) {
    System.out.println("Não é possível adicionar outro item extra para este hamburguer!");
  }

  @Override
  public void addHamburguerAddition2(String name, double price) {
    System.out.println("Não é possível adicionar outro item extra para este hamburguer!");
  }

  @Override
  public void addHamburguerAddition3(String name, double price) {
    System.out.println("Não é possível adicionar outro item extra para este hamburguer!");
  }

  @Override
  public void addHamburguerAddition4(String name, double price) {
    System.out.println("Não é possível adicionar outro item extra para este hamburguer!");
  }
}
