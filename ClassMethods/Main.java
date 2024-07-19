// Create a Main class
package ClassMethods;

public class Main {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
	  
	  
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
    
    Car myCar2 = new Car();
    myCar2.fullThrottle();
    myCar2.speed(100);
  }
}

// The car is going as fast as it can!
// Max speed is: 200 