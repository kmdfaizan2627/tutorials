package com.overloading.overriding;
// Polymorphism  -> (Overloading and Next Overriding)
// Method overloading is known as compile type polymorphism. In a class method with same name but having different signature(parameter/datatype). 
class Overloading{
	
	
	private int a=6;
	private int b=10;//initializing value with 10
	
	
	public int getB() {
		return b;
	}

	public void setB(int c) {
		this.a = c;// here assigning c value to b so 100 will get printed.
		System.out.println(b);
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		//this.a = a;// comment and uncomment  and check how its working
		System.out.println(this.a);// this.a always points instance variable(class level variable) 
		System.out.println(a);
	}
	int c=a;// class level variable is a here

	void f1(int a,int b){
		System.out.println(a+b);
	}
	
	void f1(int a,int b,int c){
		System.out.println(a+b+c);
	}
	
	int f1(int a,int b,int c,int d) {
      	return a+b+c+d;
	}
	
	String f1(String a,String b,String c) {
		String d = a+b+c;
		return d;
	}
	
	String f1(String a, String b) {
		return a+b;
	}
	static void f1(int a,int b,int c,int d,int e) {
		System.out.println(a+b+c+d+e);
	}
	
	private void f1(int a,int b,int c,int d,int e,int f) { // can not be called outside class because its private
		System.out.println(a+b+c+d+e+f);
	}
	
	private static void f1(int a,int b,int c,int d,int e,int f,int g) {// can not be called outside class because its private even though it is static
		System.out.println(a+b+c+d+e+f+g);
	}
	
	public void hello() {
		f1(2,3,4,5,6,7);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Overloading value = new Overloading();
		value.f1(4, 0);
		value.f1(4, 0,9);
		value.f1(4, 0);
		System.out.println(value.f1("sam", "afzal"));
		System.out.println(value.f1("sam", "afzal", "lammish"));
		Overloading.f1(4, 5, 4, 5, 6);
		System.out.println("<----------------------------->");
		value.hello();//Important
		
	
		System.out.println("<----------------------------->");
		System.out.println(value.getA());
		System.out.println("<----------------------------->");
		value.setA(8);
	System.out.println("<------------------------------------------------->");
		value.setB(100);

		
	}

}
