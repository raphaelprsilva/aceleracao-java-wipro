import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  private static GroceryList groceryList = new GroceryList();

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;
    printInstructions();

    while(!quit) {
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printGroceryList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchItem();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options;");
    System.out.println("\t 1 - To show grocery list.");
    System.out.println("\t 2 - To add new item.");
    System.out.println("\t 3 - To modify specific item.");
    System.out.println("\t 4 - To remove specific item.");
    System.out.println("\t 5 - To search for an item.");
    System.out.println("\t 6 - To quit the application.");
  }

  public static void addItem() {
    System.out.println("Plase enter the grocery item: ");
    String item = scanner.nextLine();
    groceryList.addGroceryItem(item);
  }

  public static void modifyItem() {
    groceryList.printGroceryList();
    System.out.println("Please, enter item number you want to modify: ");
    int itemNumber = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifiyGroceryItem(itemNumber - 1, newItem);
  }

  public static void removeItem() {
    System.out.println("Enter item position you want remove: ");
    int itemPosition = scanner.nextInt();
    scanner.nextLine();
    groceryList.removeGroceryItem(itemPosition - 1);
  }

  public static void searchItem() {
    System.out.println("Enter item you want to search: ");
    String itemToSearch = scanner.nextLine();

    if (groceryList.findItem(itemToSearch) != null) {
      System.out.println("Found item " + itemToSearch + " in our grocery list.");
    } else {
      System.out.println(itemToSearch + " is not in the shopping list.");
    }
  }
}
