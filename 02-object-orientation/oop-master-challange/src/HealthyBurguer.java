public class HealthyBurguer extends Hamburguer {
  private String healthyExtra1Name;
  private double healthyExtra1Price;

  private String healthyExtra2Name;
  private double healthyExtra2Price;

  public HealthyBurguer(String meat, double price) {
    super("Healthy", "Brown bread", meat, price);
  }

  public void addHealthAddition1(String name, double price) {
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
  }

  public void addHealthAddition2(String name, double price) {
    this.healthyExtra2Name = name;
    this.healthyExtra2Price = price;
  }

  @Override
  public double itemizeHamburguer() {
    double hamburguerPrice = super.itemizeHamburguer();
    if (this.healthyExtra1Name != null) {
      hamburguerPrice += this.healthyExtra1Price;
      System.out.println("Item adicionado: " + this.healthyExtra1Name + " / Preço adicional: " + this.healthyExtra1Price);
    }

    if (this.healthyExtra2Name != null) {
      hamburguerPrice += this.healthyExtra2Price;
      System.out.println("Item adicionado: " + this.healthyExtra2Name + " / Preço adicional: " + this.healthyExtra2Price);
    }

    return hamburguerPrice;
  }
}
