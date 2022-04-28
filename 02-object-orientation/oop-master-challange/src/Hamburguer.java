public class Hamburguer {
  private String name;
  private String bread;
  private String meat;
  private double price;

  private String addition1Name;
  private double addition1Price;

  private String addition2Name;
  private double addition2Price;

  private String addition3Name;
  private double addition3Price;

  private String addition4Name;
  private double addition4Price;

  public Hamburguer(String name, String bread, String meat, double price) {
    this.name = name;
    this.bread = bread;
    this.meat = meat;
    this.price = price;
  }

  public void addHamburguerAddition1(String name, double price) {
    this.addition1Name = name;
    this.addition1Price = price;
  }

  public void addHamburguerAddition2(String name, double price) {
    this.addition2Name = name;
    this.addition2Price = price;
  }

  public void addHamburguerAddition3(String name, double price) {
    this.addition3Name = name;
    this.addition3Price = price;
  }

  public void addHamburguerAddition4(String name, double price) {
    this.addition4Name = name;
    this.addition4Price = price;
  }

  public double itemizeHamburguer() {
    double hamburguerPrice = this.price;

    System.out.println("Nome: " + this.name + " / Pão: " + this.bread + " / Preço: " + this.price);

    if (this.addition1Name != null) {
      hamburguerPrice += this.addition1Price;
      System.out.println("Item adicionado: " + this.addition1Name + " / Preço Adicional: " + this.addition1Price);
    }

    if (this.addition2Name != null) {
      hamburguerPrice += this.addition2Price;
      System.out.println("Item adicionado: " + this.addition2Name + " / Preço Adicional: " + this.addition2Price);
    }

    if (this.addition3Name != null) {
      hamburguerPrice += this.addition3Price;
      System.out.println("Item adicionado: " + this.addition3Name + " / Preço Adicional: " + this.addition3Price);
    }

    if (this.addition4Name != null) {
      hamburguerPrice += this.addition4Price;
      System.out.println("Item adicionado: " + this.addition4Name + " / Preço Adicional: " + this.addition4Price);
    }

    return  hamburguerPrice;
  }
}
