package com.method.returntype;

public class Return2MAin {
	
	public static void main(String[] args) {
		Return2 value = new Return2();
		String a=value.f1("hello", "afzal");
		String b=value.f2("hello", "sam");
		String c=value.f2("hello", "afzal", "sam");
		int d = value.f2(7, 9);
		System.out.println(a+"                         "+b+"                                                  "+c+"                     "+d);
		value.f5(9, 9);
	}

}
