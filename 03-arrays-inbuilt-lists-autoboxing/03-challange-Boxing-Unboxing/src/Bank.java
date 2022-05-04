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
    if (findBranch(branchName) >= 0) {
      Branch branch = this.branches.get(findBranch(branchName));
      branch.newCustomer(clientName, initialTransaction);
      return true;
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
}
