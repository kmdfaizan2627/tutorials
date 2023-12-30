package com.basic;

public class Example2 {
	int a =10; // It is a instance variable or class level variable
	public static void main(String[] args) {
		//System.out.println(a); -> we can not access it inside method here like this.
		Example2 obj = new Example2();
		System.out.println(obj.a); //Now we can access it inside method like this way.
	}

}
