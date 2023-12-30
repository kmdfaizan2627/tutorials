package com.method.returntype;

public class Return2 {
	
	String f1(String a, String b) {
		String c = a+b;
		return c;
	}
	
	String f2(String a,String b, String c) { // Method Overriding when methods have same name but different number of (arguments/parameters/signature) or different datatypes
		String d = a+b+c;
            return  d;
	}
	
	String f2(String a,String b) { // Method overriding when methods have same name but different number of (arguments/parameters/signature) or different datatypes
		String c= a+b;
		return c;
	}
	
	int f2(int a, int b) { 
		int c=a+b;
		return c;
	}
	
	private int f2(int a,int b,int c) { // we can not call outside class because its private 
		int d=a+b+c;
		return d;
	}
	
	// Important
	
	int f4(int a,int b) {
		int c=a+b;
		return c;
	}
	
	void f5(int c,int d) {
		System.out.println(f4(c,d));
		int j = f4(c,d);
		System.out.println(j);
	}

}
