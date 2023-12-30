package com.basic;


class One{
	static void f2() {  
		int a=20;
		System.out.println(a);
	}
	void f1() {
		int a=10;
		System.out.println(a);
	}
}

public class Example4 {
	public static void main(String[] args) {
		One obj = new One(); 
		obj.f1();
		One.f2();
	}
}

// int a=10 we cannot directly access it with object of class One because now it is wrapped with method f1(),so now it will be only accessible through f1() method.
// here we are calling f1() through object obj then going there accessing int a=10 and then printing it.