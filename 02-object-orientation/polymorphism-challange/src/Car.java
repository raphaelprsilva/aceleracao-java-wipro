public class Car {
  protected boolean engine;
  protected int cylinders;
  protected int wheels;
  protected String name;

  public Car(int cylinders, String name) {
    this.name = name;
    this.engine = true;
    this.cylinders = cylinders;
    this.wheels = 4;
  }

  public boolean isEngine() {
    return this.engine;
  }

  public void setEngine(boolean engine) {
    this.engine = engine;
  }

  public int getCylinders() {
    return this.cylinders;
  }

  public int getWheels() {
    return this.wheels;
  }

  public String getName() {
    return this.name;
  }

  public void startEngine() {
    if (this.engine) {
      System.out.println("Engine is already on.");
    } else {
      this.engine = true;
      System.out.println("Engine is now on.");
    }
  }

  public void accelerate() {
    if (this.engine) {
      System.out.println(this.name + " is accelerating.");
    } else {
      System.out.println("The engine must be on to accelerate.");
    }
  }

  public void breakCar() {
    if (this.engine) {
      System.out.println(this.name + " is breaking.");
    } else {
      System.out.println("Engine must be on to break.");
    }
  }
}
