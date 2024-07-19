package Abstraction;
/*
 * Abstract Classes and Methods
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:
 */

//Abstract class
abstract class Animal {
	
// Abstract method (does not have a body)
public abstract void animalSound();

// Regular method
public abstract void sleep();
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: oink oink");
	}
	public void sleep() {
		System.out.println("El cerdo duerme asi: zzz zzz");
	}
	
}

class Griton extends Animal{
	public void animalSound() {
		 // The body of animalSound() is provided here
	 System.out.println("The griton says: EH EH ");
	}
	public void sleep() {
		System.out.println("El Pinche Griton Ronca asi: grrr grrr");
	}
}


class Main {
public static void main(String[] args) {
 Pig myPig = new Pig(); // Create a Pig object
 Griton pinche = new Griton();
 
 pinche.animalSound();
 pinche.sleep();
 
 myPig.animalSound();
 myPig.sleep();
 
	}
}
