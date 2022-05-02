import java.util.ArrayList;
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
          processArrayList();
          break;
        case 7:
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
    System.out.println("\t 6 - To copy the grocery list");
    System.out.println("\t 7 - To quit the application.");
  }

  public static void addItem() {
    System.out.println("Plase enter the grocery item: ");
    String item = scanner.nextLine();
    groceryList.addGroceryItem(item);
  }

  public static void modifyItem() {
    groceryList.printGroceryList();
    System.out.println("Current item name: ");
    String currentItem = scanner.nextLine();
    System.out.print("Enter replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(currentItem, newItem);
  }

  public static void removeItem() {
    System.out.println("Enter item you want remove: ");
    String item = scanner.nextLine();
    groceryList.removeGroceryItem(item);
  }

  public static void searchItem() {
    System.out.println("Enter item you want to search: ");
    String itemToSearch = scanner.nextLine();

    if (groceryList.onFile(itemToSearch)) {
      System.out.println("Found item " + itemToSearch + " in our grocery list.");
    } else {
      System.out.println(itemToSearch + " is not in the shopping list.");
    }
  }

  public static void processArrayList() {
    // First way to copy data from an ArrayList
    ArrayList<String> newArray = new ArrayList<String>();
    newArray.addAll(groceryList.getGroceryList());

    // Second way to copy data from an ArrayList
    // ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

    // Third way to copy data from an ArrayList
    String[] stringArray = new String[groceryList.getGroceryList().size()];
    stringArray = groceryList.getGroceryList().toArray(stringArray);
  }
}
