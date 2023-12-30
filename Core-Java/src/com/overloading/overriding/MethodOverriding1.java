/**
 * 
 */
package com.overloading.overriding;

/**
 * 
 */
//Method overriding is known as runtime type polymorphism. It can only achieved through inheritance only. 
// In method overriding we extend a class from another class to change functionality of method according to our requirement.
//Here we can see MethodOverridingExample1 has method f1() method and we have overriding this method in MethodOverriding1 and changed
// its functionality.
class MethodOverridingExample1{ //This is parent class or super class
	
	public void f1() {
		System.out.println("Hello");
	}
}


public class MethodOverriding1 extends MethodOverridingExample1{
	@Override
	public void f1() {
		System.out.println("afzal");
	}
	public static void main(String[] args) {
		MethodOverriding1 obj = new MethodOverriding1();
		obj.f1();
		MethodOverriding1 obj1 = new MethodOverriding1();// MethodOverriding1()->This is child class.
		obj1.f1(); // new MethodOverriding1();-> This is the to initialize a object
		
	}
}


