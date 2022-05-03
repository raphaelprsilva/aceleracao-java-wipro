import java.util.ArrayList;

public class MobilePhone {
  private String myNumber;
  private ArrayList<Contacts> contacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.contacts = new ArrayList<Contacts>();
  }

  public boolean addContact(Contacts newContact) {
    if (findContact(newContact.getName()) >= 0) {
      System.out.println("O contato já existe!");
      return false;
    }

    contacts.add(newContact);
    return true;
  }

  public boolean update(Contacts oldContact, Contacts newContact) {
    int foundPosition = findContact(oldContact);

    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + " não foi encontrado.");
      return false;
    } else if (findContact(newContact.getName()) != -1) {
      System.out.println("Já existe um contato com esse nome.");
      return false;
    }

    this.contacts.set(foundPosition, newContact);
    System.out.println(oldContact.getName() + " com o número " + oldContact.getPhoneNumber() + " foi substituído por " + newContact.getName() + " com o número " + newContact.getPhoneNumber());
    return true;
  }

  public void printContacts() {
    System.out.println("---------------------------------");
    System.out.println("Você tem " + contacts.size() + " contatos na sua agenda.");

    for (Contacts contact : this.contacts) {
      System.out.println((contacts.indexOf(contact) + 1) + " - Nome: " + contact.getName() + " / Número: " + contact.getPhoneNumber());
    }
    System.out.println("---------------------------------");
  }

  private int findContact(Contacts contact) {
    return this.contacts.indexOf(contact);
  }

  private int findContact(String contactName) {
    for (int index = 0; index < this.contacts.size(); index += 1) {
      Contacts contact = this.contacts.get(index);

      if (contact.getName().equals(contactName)) {
        return index;
      }
    }

    return -1;
  }

  public String queryContact(Contacts contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }

  public Contacts queryContact(String name) {
    int position = findContact(name);

    if (position >= 0) {
      return this.contacts.get(position);
    }

    return null;
  }

  public boolean removeContact(Contacts contact) {
    int foundPostion = findContact(contact);

    if (foundPostion >= 0) {
      this.contacts.remove(foundPostion);
      return true;
    }

    System.out.println(contact.getName() + " não foi encontrado, portanto não foi removido.");
    return false;
  }
}
