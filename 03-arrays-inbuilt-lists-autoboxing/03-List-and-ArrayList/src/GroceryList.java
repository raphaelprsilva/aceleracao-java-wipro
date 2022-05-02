import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addGroceryItem(String item) {
    groceryList.add(item);
  }

  public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " in your grocery list");

    for (int index = 0; index < this.groceryList.size(); index += 1) {
      System.out.println((index + 1) + ". " + groceryList.get(index));
    }
  }

  public void modifyGroceryItem(String currentItem, String newItem) {
    int position = findItem(currentItem);

    if (position >= 0) {
      modifiyGroceryItem(position, newItem);
    }
  }

  private void modifiyGroceryItem(int position, String newItem) {
    this.groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position + 1) + " has been modified.");
  }

  public void removeGroceryItem(String item) {
    int position = findItem(item);

    if (position >= 0) {
      removeGroceryItem(position);
    }
  }

  private void removeGroceryItem(int position) {
    String item = this.groceryList.get(position);
    System.out.println(item + " was removed.");
    this.groceryList.remove(position);
  }

  private int findItem(String searchItem) {
    return this.groceryList.indexOf(searchItem);
  }

  public boolean onFile(String searchItem) {
    int position = findItem(searchItem);

    if (position >= 0) {
      return true;
    }
    return false;
  }
}
