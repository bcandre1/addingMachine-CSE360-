//Brandon Andrews, CSE360
package cse360assignment02;

public class AddingMachine {
  private int total;
  private String totalString = "0 ";
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  totalString = totalString + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  totalString = totalString + " - " + value;
  }

  public String toString () {
    return totalString;
  }

  public void clear() {
	  total = 0;
	  totalString = "0 ";
  }

/*public static void main(String [] args) {
	String output = " ";
	AddingMachine a1 = new AddingMachine();
	a1.add(5);
	System.out.println("Adding 5");
	a1.subtract(2);
	System.out.println("Subtracting 2");
	output = a1.toString();
	System.out.println(output);
	a1.clear();
	System.out.println("Cleared...");
	output = a1.toString();
	System.out.println(output);
} */  //For testing purposes 


}