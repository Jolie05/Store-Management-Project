public class Drink{
  //instance variable
  private String flavor;
  private int qtyDrinks;
  private String size;
  private double price;

  //no argument constructors
  public Drink(){
    this.flavor = "water";
    this.qtyDrinks = 1;
    this.size = "medium";
    this.price = 1.00;
  }

  /*
  parameteried constructor
  just the drink flavor
  when they didn't specifically order the other parts of the drink(s)
  */
  public Drink(String flavor){
    this.flavor = flavor;
    this.qtyDrinks = 1;
    this.size = "medium";
    this.price = 1.00;
  }
  
  /*
  full parameterized constructor
  all five parameters: what the flavor is called,
  how many drinks, size of the drinks, and the price
  */
  public Drink(String flavor, int qtyDrinks, String size, double price){
    this.flavor = flavor;
    this.qtyDrinks = qtyDrinks;
    this.size = size;
    this.price = price;
  }
  

  //accessor method-make sure there is a value to not let the variables to be
  public String getFlavor(){ //returning the flavor
    return flavor;
  }

  public int getQtyDrinks(){ //returning the qty of drinks
    return qtyDrinks;
  }

  public String getSize(){ //returning the size for all the drinks
    return size;
  }

  public double getPrice(){ //returning the price for each drink
    return price;
  }
  
  //mutator method-return value
  public void setFlavor(String flavor){ //changing the flavor
    this.flavor = flavor;
  }

  public void setQtyDrinks(int qtyDrinks){ //changing the qty of drinks
    this.qtyDrinks = qtyDrinks;
  }

  public void setSize(String size){ //changing the size of the drinks
    this.size = size;
  }

  public void setPrice(double price){ //changing the price of each drink
    this.price = price;
  }
  
  /*
  to string override
  format: "The flavor is ______. With ______, all of them size ______ costing ______."
  */
  public String toString(){
    return "The drink is " + flavor + ". " + qtyDrinks + " in total, all of them size " + size + " and each costing " + price + ".";
  }
}