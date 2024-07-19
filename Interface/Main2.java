package Interface;
/*
 * Multiple Interfaces
To implement multiple interfaces, separate them with a comma:
 */

interface FirstInterface {
	  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main2 {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}