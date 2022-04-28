public class Hamburguer {
  private String bread;
  private String meat;
  private boolean lettuce;
  private boolean tomato;
  private boolean carrot;
  private boolean bacon;
  private double price;
  private int countBurguerItems;

  public Hamburguer(String bread, String meat, double price) {
    this.bread = bread;
    this.meat = meat;
    this.price = price;
  }

  // Quando adicionar um novo item, aumenta o preço
  public void addItem(String itemToAdd) {

  }
}
