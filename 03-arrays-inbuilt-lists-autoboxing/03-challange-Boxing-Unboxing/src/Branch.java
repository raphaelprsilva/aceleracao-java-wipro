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

  public boolean newCustomer(String clientName, double initialTransaction) {
    if (findCustomer(clientName) >= 0) {
      System.out.println("Não foi possível adicionar o cliente. Já existe um cliente com o nome " + clientName);
      return false;
    }

    Customer customer = new Customer(clientName, initialTransaction);
    this.customers.add(customer);
    System.out.println("Cliente " + clientName + " adicionado com sucesso. Depósito inicial: " + initialTransaction);
    return true;
  }

  public boolean addCustomerTransaction(String clientName, double transaction) {
    // 1. Verificar se o cliente já existe
    // 2. Se o cliente já existir, somar o valor de transaction ao depósito inicial já feito.
    // 4. Caso contrário, recusar a transação, ou seja, retornar falso.
    if (findCustomer(clientName) >= 0) {
      Customer customer = this.customers.get(findCustomer(clientName));
      customer.addTransaction(transaction);
      return true;
    }
    return false;
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
