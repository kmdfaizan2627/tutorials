package com.inheritance;

//When a Class implement interface and extend classes at same time then it falls under Hybrid Inheritance
//First interface
class A1 {
	void methodA1() {
		System.out.println("Hello");
	}
}

//Second interface
interface B1 {
	void methodB1();
}

///When a Class implement interface and extend classes at same time then it falls under Hybrid Inheritance
class C extends A1 implements B1 {
	@Override
	public void methodA1() {
		System.out.println("Method A");
	}

	@Override
	public void methodB1() {
		System.out.println("Method B");
	}
}

//Main class
public class HybridInheritance {
	public static void main(String[] args) {
		// Creating an instance of class C
		C myObject = new C();

		// Accessing methods from both interfaces
		myObject.methodA1();
		myObject.methodB1();
		
		B1 b1 = new C();
		b1.methodB1();
		
	}
}
