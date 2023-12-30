package com.abstractClass.java;
// An abstract class in Java is not required to have abstract methods.
//We can not initialize abstract class with new keyword because it have abstract methods
// Even though if it does not have abstract method then also we can not initialize it with new keyword. 
abstract class Example1{
	
}
class F2 extends Example1{
	void f4() {
		System.out.println("New ");
	}
}
public class AbstractClass2 {
	public static void main(String[] args) {
		F2 obj = new F2();
		obj.f4();
	}

}
