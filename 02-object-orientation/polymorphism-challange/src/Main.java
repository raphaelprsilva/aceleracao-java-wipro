public class Main {
  public static void main(String[] args) {
    Ferrari ferrari = new Ferrari(8, "Ferrari");

    ferrari.setEngine(false);
    ferrari.accelerate();

    ferrari.setEngine(true);
    ferrari.breakCar();
  }
}
