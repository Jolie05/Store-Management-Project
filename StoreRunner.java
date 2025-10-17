import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

/*a drink without the paramaiterized constructor
also using accessor methods
*/
    Drink water = new Drink();
    System.out.println("Flavor: " + water.getFlavor());
    System.out.println("Amount of drinks? " + water.getQtyDrinks());
    System.out.println("Size of all the drinks? " + water.getSize());
    System.out.println("Price of each drink: " + water.getPrice());

//to separate the different drinks
    System.out.println("--------------------------------------------------------------------");
    
//New drinks, boba
    Boba thaiTea = new Boba("Thai Tea", 2, "small", 6.99, true);
    System.out.println(thaiTea);
    // calling mutator method
    thaiTea.setIsMilkTea(false);
    System.out.println("Is the boba milk tea now? " + thaiTea.getIsMilkTea());

//to separate the different drinks
    System.out.println("--------------------------------------------------------------------");

//New drinks, ice
    Soda sprite = new Soda("Sprite", 1, "small", 3.99, false, true);
    System.out.println(sprite);
    
  }
}