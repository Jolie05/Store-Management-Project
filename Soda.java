public class Soda extends Drink {
  //instance variables
  private boolean isCanned;
  private boolean hasIce;

  //no argument constructor
  public Soda(){
    isCanned = true;
    hasIce = false;
  }
  
  //parameterized constructor
  public Soda(String flavor, int qtyDrinks, String size, double price, boolean isCanned, boolean hasIce){
    super(flavor, qtyDrinks, size, price);
    this.isCanned = isCanned;
    this.hasIce = hasIce;
  }
  
  //accessor method
  public boolean getIsCanned() { //returning if the soda is in a can
    return isCanned;
  }

  public boolean getHasIce() { //returning if the soda has ice
    return hasIce;
  }
  
  //mutator method
  public void setIsCanned(boolean isCanned) { //changing if the soda is in a can
    this.isCanned = isCanned;
  }

  public void getHasIce(boolean hasIce) { //returning if the soda has ice
    this.hasIce = hasIce;
  }
  
  /*
  toString override
  format: 
  */
  public String toString(){
    return super.toString() + "\nIs the sode in a can? " + isCanned + "\nDoes the sode have ice with it? " + hasIce;
  }
  
}