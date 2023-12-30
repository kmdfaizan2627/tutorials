package com.interfaces;

//Interfaces are just like classes that we create but here we don't have body of methods, only methods are defined.
//We can not provide body to methods. We can not define variable here like int a.It will have only methods without body.
//We can have void,non-static, return type methods but without body.
// Till Java 7 static methods were not allowed in Interfaces.
//Interface are used for 100% abstraction.
// We can not create object of interfaces
public interface FirstInterface {
	//int a;
	public void f1();
	public void f1(int a , int b);
	public String f2(String a, String b, String c);
	
}

