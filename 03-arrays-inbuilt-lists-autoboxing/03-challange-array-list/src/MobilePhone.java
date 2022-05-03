import java.util.ArrayList;

public class MobilePhone {
  private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

  public void addContact(Contacts newContact) {
    contacts.add(newContact);
  }

  public void printContacts() {
    System.out.println("---------------------------------");
    System.out.println("Você tem " + contacts.size() + " contatos na sua agenda.");

    for (Contacts contact : this.contacts) {
      System.out.println("Nome: " + contact.getName() + " / Número: " + contact.getPhoneNumber());
    }
    System.out.println("---------------------------------");
  }
}
