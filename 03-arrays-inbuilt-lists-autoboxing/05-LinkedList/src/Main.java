import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Raphael", 54.96);
    Customer anotherCustomer;

    anotherCustomer = customer;
    anotherCustomer.setBalance(12.18);
    System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

    ArrayList<Integer> integers = new ArrayList<Integer>();

    integers.add(1);
    integers.add(3);
    integers.add(5);

    System.out.println("First for");
    for (int index = 0; index < integers.size(); index += 1) {
      System.out.println(index + ": " + integers.get(index));
    }

    integers.add(1, 2);

    System.out.println("------------------");
    System.out.println("Second for:");
    for (int index = 0; index < integers.size(); index += 1) {
      System.out.println(index + ": " + integers.get(index));
    }
  }
}
