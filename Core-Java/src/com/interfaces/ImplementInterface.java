package com.interfaces;


//For classes we use "extends" keyword but for interfaces we use "implements" keyword. 
//Here we are implementing FirstInterface interface in ImplementationInterface class and we are defining body of methods which were
//present in FirstInterface interface.
//If we are implementing any Interface in a class then we need to override all methods defined in interface.
//But when we extend a class in another class then we override only those methods which are required by us in writing logic.

public class ImplementInterface implements FirstInterface{

	@Override
	public void f1() {
		System.out.println("Yes");
		
	}

	@Override
	public void f1(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public String f2(String a, String b, String c) {
		String d = a+b+c;
		return d;
	}

}
