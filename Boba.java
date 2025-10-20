public class Boba extends Drink {
  //instance variables
  private boolean isMilkTea;

  //no argument constructor
  public Boba() {
    isMilkTea = true;
  }

  /*
  parameteried constructor
  */
  public Boba(String flavor, int qtyDrinks, String size, double price, boolean isMilkTea){
    super(flavor, qtyDrinks, size, price);
    this.isMilkTea = isMilkTea;
  }
  
  //accessor method:
  public boolean getIsMilkTea(){ //returning if it is milk tea
    return isMilkTea;
  }

  //mutator method:
  public void setIsMilkTea(boolean isMilkTea){ //changing if it is milk tea
    this.isMilkTea = isMilkTea;
  }

  /*
  toString override
  format: "The flavor is ______. With ______, all of them size ______ costing ______.
  Is this boba drink milk tea? _______"
  */
  
  public String toString(){
    return super.toString() + "\nIs this boba drink milk tea? " + isMilkTea;
  }
  
}
