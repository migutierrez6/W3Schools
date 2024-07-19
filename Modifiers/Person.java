package Modifiers;

//abstract class The class cannot be used to create objects 
abstract class Person {
public String fname = "John";
public int age = 24;
public abstract void study(); // abstract method
}

//Subclass (inherit from Main)
class Student extends Person {
public int graduationYear = 2018;

public void study() { // the body of the abstract method is provided here
 System.out.println("Studying all day long");
}

}

class School {
public static void main(String[] args) {
 // create an object of the Student class (which inherits attributes and methods from Main)
 Student Student1 = new Student();

 System.out.println("Name: " + Student1.fname);
 System.out.println("Age: " + Student1.age);
 System.out.println("Graduation Year: " + Student1.graduationYear);
 Student1.study(); // call abstract method
}

}