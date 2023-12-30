package com.methodsclass.scenarios;

public class WelcomeMain {
	
	public void f1()
	{
		System.out.println("In WelcomeMain f1() method");
	}
	public static void main(String[] args) {
	Welcome1 obj1 = new Welcome1();
		
	
		
		System.out.println("<!---------------------------------------!>");
		
		obj1.f3();
	
		
	}

}

// We can not call directly any method inside main(). If it is non- static then we have to create object of class or if it is static then with classname.

//Methods - 
////*In Java Parameterized Method and non-parameterized methods.
//Example - 
class Example {
   public void f1(int a,int b){
	System.out.print("In f1() method but it has arguments(parameters)");
   }
   public void f2(){ 
	System.out.print("In f2() method but it has no arguments");
   }
}
class ExampleMain{
  public static void main(String[] args){
    Example ex = new Example();
    ex.f1(4,5);
    ex.f2();
}}
//Here in above example we are calling f1() method which is taking two arguments of int type, so we need to pass two parameters.
//When we are doing ex.f1(4,5); -> ex is calling f1 method and passing two parameters, where 'a' will be assingned value 4, 'b' will be assigned value 5.
//and there we are printing by doing  System.out.print("In f1() method but it has arguments(parameters)").
//Whenever we call any method then whole method get executed line by line.
//
//When we are calling ex.f2(); here f2 method does not require any parameter(arguments). So we are not required to pass any parameters.And in that f2 method we 
//are just printing by doing System.out.print("In f2() method but it has no arguments"); S
