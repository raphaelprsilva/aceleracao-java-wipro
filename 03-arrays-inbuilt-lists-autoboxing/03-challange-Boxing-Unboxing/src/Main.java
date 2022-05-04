public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank("Banco Nacional");

    bank.addBranch("Brasília");

    bank.addCustomer("Brasília", "Tim", 50.05);
    bank.addCustomer("Brasília", "Mike", 175.34);
    bank.addCustomer("Brasília", "Percy", 220.12);

    bank.addCustomerTransaction("Brasília", "Tim", 44.22);
    bank.addCustomerTransaction("Brasília", "Tim", 12.44);
    bank.addCustomerTransaction("Brasília", "Mike", 1.65);

    bank.listCustomers("Brasília", true);
  }
}
