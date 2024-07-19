// Create a Main class
package Modifiers;

public class main {
	int x = 0;
	// final int x = 10;
	// final double PI = 3.14;
  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }
  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	  main myObj = new main();
	    myObj.myPublicMethod(); // Call the public method

  //  myObj.x = 50; // will generate an error: cannot assign a value to a final variable
  //  myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}

// The car is going as fast as it can!
// Max speed is: 200 