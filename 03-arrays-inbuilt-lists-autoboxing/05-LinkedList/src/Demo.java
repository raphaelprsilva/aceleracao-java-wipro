import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();

    addInOrder("Uberlândia", placesToVisit);
    addInOrder("Araguari", placesToVisit);
    addInOrder("Indianópolis", placesToVisit);
    addInOrder("Monte Carmelo", placesToVisit);
    addInOrder("Patos de Minas", placesToVisit);

    printList(placesToVisit);

    addInOrder("Amanhece", placesToVisit);
    addInOrder("Patos de Minas", placesToVisit);

    printList(placesToVisit);

    visit(placesToVisit);
  }

  private static void printList(LinkedList<String> linkedList) {
    // Maneira 1 de imprimir a lista
    // for (int index = 0; index < linkedList.size(); index += 1) {
    //   System.out.println("index: " + index + " ~ Local: " + linkedList.get(index));
    // }

    // Maneira 2 de imprimir a lista
    Iterator<String> index = linkedList.iterator();
    while (index.hasNext()) {
      System.out.println("Visitar Local: " + index.next());
    }
    System.out.println("--------------------------");
  }

  private static boolean addInOrder(String newCity, LinkedList<String> linkedList) {
    // 'ListIterator' é um tipo de cursor no Java. É um iterador que serve para percorrer os elementos de uma lista.
    ListIterator<String> stringListIterator = linkedList.listIterator();

    // Percorrendo a lista. Enquanto tiver um próximo elemento na lista, o loop continuará.
    // Vale ressaltar que não existe um current, ou seja, o listIterator, está sempre antes ou depois do item desejado.
    while (stringListIterator.hasNext()) {
      // `comparison` pode ser igual a zero, maior que zero ou menor que zero.
      int comparison = stringListIterator.next().compareTo(newCity);

      // Se for igual a zero, significa que a cidade passada como argumento, é igual a outra cidade da lista
      // Neste caso, não adicionaremos ela na lista
      if (comparison == 0) {
        System.out.println(newCity + " já existe na lista.");
        return false;
      } else if (comparison > 0) {
        // Se for maior que zero, a nova cidade deverá ser adicionada
        stringListIterator.previous();
        stringListIterator.add(newCity);
        return true;
      } else if (comparison < 0) {
        // vai para a próxima cidade
      }
    }

    stringListIterator.add(newCity);
    return true;
  }

  private static void visit(LinkedList<String> cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;

    ListIterator<String> listIterator = cities.listIterator();

    // Precisamos verificar se existe 'cities' está vazia, ou seja, se não tem cidades no LinkedList
    if (cities.isEmpty()) {
      System.out.println("Não existe cidade no itinerário.");
      return;
    } else {
      System.out.println("Visitando agora " + listIterator.next());
      printMenu();
    }

    while(!quit) {
      int selectedOption = scanner.nextInt();
      scanner.nextLine();

      switch (selectedOption) {
        case 0:
          System.out.println("As férias acabaram");
          quit = true;
          break;
        case 1:
          if (!goingForward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }
          if (listIterator.hasNext()) {
            System.out.println("Visitando agora " + listIterator.next());
          } else {
            System.out.println("Chegou no final da lista.");
            goingForward = false;
          }
          break;
        case 2:
          if (goingForward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }
          if (listIterator.hasPrevious()) {
            System.out.println("Visitando agora " + listIterator.previous());
          } else {
            System.out.println("Estamos no início da lista");
            goingForward = true;
          }
          break;
        case 3:
          printMenu();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("------------------------");
    System.out.println("Selecione uma opção");
    System.out.println("0 - para sair");
    System.out.println("1 - Mostrar próxima cidade");
    System.out.println("2 - Mostrar cidade anterior");
    System.out.println("3 - Mostrar o menu");
  }
}
