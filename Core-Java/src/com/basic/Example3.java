package com.basic;

public class Example3 {
	static int b=10;
      int a =20;
      public static void main(String[] args) {
		int a =10;
		System.out.println("Inside method variable   =      "+a);// Directly accessing method 'a' variable.Method variables are also called Local variable.
		Example3 obj = new Example3();
		System.out.println("Class level variable   =            "+obj.a); // class level(instance variable) accessing like this way.
		System.out.println("static class level variable    =    "+b); //static variable can be accessed anywhere inside a class.When we calling static variable
		// inside same class where it is initialized then there is no need 	to call it with className. 
      }
}

//Note - We can not create class inside another class. 
// We can not create method inside another method.
