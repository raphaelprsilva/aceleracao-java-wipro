import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static MobilePhone mobilePhone = new MobilePhone("34 99954-2131");

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;
    printOptions();

    while (!quit) {
      System.out.println("---------------------------------");
      System.out.print("Entre com a opção desejada (Digite 0 para ver o menu): ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          printOptions();
          break;
        case 1:
          showContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
           update();
          break;
        case 4:
           remove();
          break;
        case 5:
          queryContact();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  public static void printOptions() {
    System.out.println("---------------------------------");
    System.out.println("0 - Mostrar as opções do menu");
    System.out.println("1 - Mostrar lista de contatos");
    System.out.println("2 - Adicionar novo contato");
    System.out.println("3 - Atualizar novo contato");
    System.out.println("4 - Remover contato");
    System.out.println("5 - Pesquisar contato pelo nome");
    System.out.println("6 - Sair");
    System.out.println("---------------------------------");
  }

  public static void showContacts() {
    mobilePhone.printContacts();
  }

  public static void addContact() {
    System.out.print("Nome do contato: ");
    String contactName = scanner.nextLine();
    System.out.print("Telefone do contato: ");
    String contactPhoneNumber = scanner.nextLine();
    Contacts newContact = Contacts.createContact(contactName, contactPhoneNumber);

    if (mobilePhone.addContact(newContact)) {
      System.out.println("Contato " + contactName + " com o número " + contactPhoneNumber + " foi criado!");
    } else {
      System.out.println("Não foi possível criar um novo usuário.");
    }
  }

  public static void update() {
    System.out.print("Digite o nome do usuário que você deseja atualizar: ");
    String name = scanner.nextLine();

    Contacts existingContactRecord = mobilePhone.queryContact(name);

    if (existingContactRecord == null) {
      System.out.println("Não existe um usuário com esse nome");
      return;
    }

    System.out.print("Digite o novo nome a ser atualizado: ");
    String newUserName = scanner.nextLine();
    System.out.print("Digite o novo telefone a ser atualizado: ");
    String newPhoneNumber = scanner.nextLine();
    Contacts newContact = Contacts.createContact(newUserName, newPhoneNumber);
    mobilePhone.update(existingContactRecord, newContact);
  }

  public static void remove() {
    System.out.println("---------------------------------");
    System.out.print("Digite o nome do contato que deseja remover: ");
    String name = scanner.nextLine();

    Contacts existingContactRecord = mobilePhone.queryContact(name);

    if (existingContactRecord == null) {
      System.out.println("Não foi possível deletar o usuário " + name);
      return;
    }

    if (mobilePhone.removeContact(existingContactRecord)) {
      System.out.println("Contato deletado com sucesso.");
    } else {
      System.out.println("Erro ao deletar o contato.");
    }
  }

  public static void queryContact() {
    System.out.print("Digite o nome do contato: ");
    String name = scanner.nextLine();

    Contacts foundContact = mobilePhone.queryContact(name);

    if (foundContact == null) {
      System.out.println("Não encontramos o usuário.");
      return;
    }

    System.out.println("Nome: " + foundContact.getName() + " / Número: " + foundContact.getPhoneNumber());
  }
}
