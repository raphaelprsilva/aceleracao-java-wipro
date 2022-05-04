import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<Customer>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Customer> getCustomers() {
    return this.customers;
  }

  public int findCustomer(String clientName) {
    for (int index = 0; index < this.customers.size(); index += 1) {
      Customer customer = this.customers.get(index);

      if (customer.getName().equals(clientName)) {
        return index;
      }
    }

    return -1;
  }
}
