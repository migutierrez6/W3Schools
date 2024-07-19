package practice;

public class ClassAtrributes {
	String firstName = "Manuel";
	String LastName = "Gutierrez";
	int age = 30;
	int x = 5;
	final int y = 10;	// cannot modify 

	public static void main(String[] args) {
		ClassAtrributes obj = new ClassAtrributes();
		obj.x = 40; // override existing value
	 // obj.y = 14; // error cannot modify final access modifier
		System.out.println(obj.x); 
		System.out.println("First name: " +obj.firstName+ " Last name: " +obj.LastName+ " Age: " +obj.age );
		myMethod(); // static method can be called without a object
		obj.myMethod2();
	}
	static void myMethod() {
		System.out.println("static method");
	}
	public void myMethod2() {
		System.out.println("public method");
	}
	
}
