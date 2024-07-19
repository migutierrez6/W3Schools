package InnerClass;

public class Main {

	public static void main(String[] args) {
		
Outer out = new Outer();
Outer.Inner in = out.new Inner();
System.out.println(in.y + out.x);
	}
}

	class Outer{
		int x = 6;
	
	class Inner{
		int y = 10;
		int x = 4;
	}
}
