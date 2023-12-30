package com.inheritance;


//Multiple Inheritance is not allowed in Java in terms of classes due to ambiguity issue.
//When a class implements more than one interface then it is Multiple inheritance.  
//First Interface
interface A {
	void methodA();
}

//Second Interface
interface B {
	void methodB();
	void methodA();
}

//Class implementing both interfaces
class MyClass implements A, B {
	@Override
	public void methodA() {
		System.out.println("Executing methodA");
	}

	@Override
	public void methodB() {
		System.out.println("Executing methodB");
	}
}

//Main class
public class MultipleInheritance {
	public static void main(String[] args) {
		// Creating an instance of MyClass
		MyClass myObject = new MyClass();

		// Calling methods from both interfaces
		myObject.methodA();
		myObject.methodB();
		
	}
}
