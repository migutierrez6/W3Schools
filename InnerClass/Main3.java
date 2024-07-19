package InnerClass;
/* Static Inner Class
 * An inner class can also be static, which means that you can access it without creating an object of the outer class: 
 * */

class Outer3{
	int x = 7;
	
 static class Inner3{
	int y = 8;
	}
}

public class Main3 {
	public static void main(String[] args) {
		Outer3.Inner3 in = new Outer3.Inner3();
		System.out.println("The result of the outer value is: " + ( in.y));
		
	}
}
