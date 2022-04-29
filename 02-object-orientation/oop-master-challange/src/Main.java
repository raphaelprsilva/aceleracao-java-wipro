public class Main {
  public static void main(String[] args) {
    Hamburguer hamburguer = new Hamburguer("My Burguer", "Pão Especial", "Hamburgurer de Porco", 15.00);
    double price = hamburguer.itemizeHamburguer();
    hamburguer.addHamburguerAddition1("tomato", 1.2);
    hamburguer.addHamburguerAddition2("lettuce", 2.3);
    System.out.println("Preço total: " + hamburguer.itemizeHamburguer());

    HealthyBurguer healthyBurguer = new HealthyBurguer("Bacon", 5.0);
    healthyBurguer.addHamburguerAddition1("Egg", 2.5);
    System.out.println("Preço total do Healthy Burger: " + healthyBurguer.itemizeHamburguer());

    DeluxeHamburguer deluxeHamburguer = new DeluxeHamburguer();
    deluxeHamburguer.itemizeHamburguer();
    deluxeHamburguer.addHamburguerAddition1("Item 1", 3.5);
  }
}
