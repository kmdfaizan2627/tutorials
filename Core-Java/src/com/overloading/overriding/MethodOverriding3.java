package com.overloading.overriding;

class Addition{
	int f1(int a,int b) {
		return a+b;
	}
}



public class MethodOverriding3 extends Addition{
	@Override
	int f1(int a,int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		 MethodOverriding3 obj = new MethodOverriding3();
		System.out.println(obj.f1(10, 8));
	}

}
