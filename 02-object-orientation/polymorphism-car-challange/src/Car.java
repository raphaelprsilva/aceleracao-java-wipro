public class Car {
  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.engine = true;
    this.wheels = 4;
  }

  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate()";
  }

  public String stop() {
    return getClass().getSimpleName() + " -> stop()";
  }

  public int getCylinders() {
    return this.cylinders;
  }

  public String getName() {
    return this.name;
  }
}
