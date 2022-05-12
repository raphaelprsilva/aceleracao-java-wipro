public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("milo");
    dog.eat();
    dog.breath();

    PicaPau picaPau = new PicaPau("Pica pau brasileiro");
    picaPau.breath();
    picaPau.eat();
    picaPau.fly();

    Pinguin pinguin = new Pinguin("Imperador");
    pinguin.fly();
  }
}
