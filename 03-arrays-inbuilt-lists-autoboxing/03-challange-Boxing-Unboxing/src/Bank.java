import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String branchName) {
    // 1. Preciso verificar se já existe uma filial com o nome passado por argumento
    // 2. Depois de verificar, adicionar a nova branch (filial) e retornar true, caso não exista
    if (findBranch(branchName) >= 0) {
      System.out.println("A filial " + branchName + " já existe.");
      return false;
    }

    Branch newBranch = new Branch(branchName);
    this.branches.add(newBranch);
    return true;
  }

  public boolean addCustomer(String branchName, String clientName, double initialTransaction) {
    // 1. Preciso verificar se a filial (branchName) passada existe.
    // 2. Se existir, devo criar o novo cliente. (Isso deve ser feio na classe Branch) => Mas antes, devo verificar se existe algum cliente com o mesmo nome.
    // 3. Caso contrário, disparar uma mensagem e retornar false.
    int branchIndex = findBranch(branchName);
    if (branchIndex >= 0) {
      Branch branch = this.branches.get(branchIndex);
      return branch.newCustomer(clientName, initialTransaction);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String clientName, double transaction) {
    int branchIndex = findBranch(branchName);

    if (branchIndex >= 0) {
      Branch branch = this.branches.get(branchIndex);
      return branch.addCustomerTransaction(clientName, transaction);
    }
    return false;
  }

  private int findBranch(String branchName) {
    for (int index = 0; index < this.branches.size(); index += 1) {
      Branch branch = this.branches.get(index);

      if (branch.getName().equals(branchName)) {
        return index;
      }
    }

    return -1;
  }

  public boolean listCustomers(String branchName, boolean listTransactions) {
    // 1. Verificar se a filial (branch) existe.
    // 2. Se a filial existir:
    // 2.1. Verificar se listTransactions é verdadeiro ou false
    // 2.2. Se listTransactions for verdadeiro, mostrar as transações de todos os clientes.
    // 2.3 Se listTransactions for falso, mostrar apenas os nomes dos clientes.
    if (findBranch(branchName) >= 0) {
      Branch branch = this.branches.get(findBranch(branchName));

      if (listTransactions) {
        // Mostrar as transações de todos os clientes
        System.out.println("------------------------------");
        System.out.println("Detalhes da filial de " + branch.getName());
        System.out.println("------------------------------");

        for (int index = 0; index < branch.getCustomers().size(); index += 1) {
          String customerName = branch.getCustomers().get(index).getName();
          System.out.println("------------------------------");
          System.out.println("Cliente : " + customerName);
          System.out.println("------------------------------");
          System.out.println("-------- Transações ----------");

          ArrayList<Double> customerTransactions = branch.getCustomers().get(index).getTransactions();

          for (int j = 0; j < customerTransactions.size(); j += 1) {
            System.out.println((j + 1) + " - Valor: " + customerTransactions.get(j));
          }
          System.out.println("------------------------------");
        }
      } else {
        // Mostrar apenas os nomes dos clientes
        for (int index = 0; index < branch.getCustomers().size(); index += 1) {
          String customerName = branch.getCustomers().get(index).getName();
          System.out.println("------------------------------");
          System.out.println("Cliente : " + customerName);
          System.out.println("------------------------------");
        }
      }
      return true;
    }
    return false;
  }
}
