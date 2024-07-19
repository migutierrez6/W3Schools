package InnerClass;
/*
 * Java Inner Classes
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together,
which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:
 */

class Outer2{
	int x = 7;
	
 class Inner2{
	int y = 8;
	}
}

public class Main2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Outer2.Inner2 in = out.new Inner2();
		System.out.println("The result of the sum of the inner value and the outer value is: " + (out.x + in.y));
		
	}
}
