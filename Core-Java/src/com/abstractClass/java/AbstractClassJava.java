package com.abstractClass.java;

// Interface is used for 100% abstraction(all method will not have body)
//But in abstract class we will have both methods(with body and without body) 
//Abstract meaning short idea only, not overall every idea. Here we are having method idea only that method 
//name is f1() 
abstract class  WelcomeAbstract{
	abstract void f1();
	void f2() {
		System.out.println("With body");
	}
	
	
}

public class AbstractClassJava extends WelcomeAbstract{

	@Override
	void f1() {
       
		System.out.println("Abstract Method");		
	}
	public static void main(String[] args) {
		WelcomeAbstract obj = new AbstractClassJava();
		obj.f1();
		obj.f2();
	}

}
