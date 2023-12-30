package com.overloading.overriding;

public class MethodOverriding2Main extends MethodOverriding2 {

	@Override
	public void f1() {
		System.out.println("afzal khan");
	}

	public static void main(String[] args) {
		MethodOverriding2 obj = new MethodOverriding2();
		obj.f1();	
		MethodOverriding2 obj1 = new MethodOverriding2Main();
		MethodOverriding2 obj2 =  new MethodOverriding2();
		
		

	}

}
