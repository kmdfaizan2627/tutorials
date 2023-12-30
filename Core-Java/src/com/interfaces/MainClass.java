package com.interfaces;

public class MainClass {
	public static void main(String[] args) {
		ImplementInterface impl = new ImplementInterface();
		//it can be written like
		FirstInterface inter = new ImplementInterface();
		inter.f1();
		inter.f1();
		impl.f1(6, 7);
		String c=impl.f2("afzal", "friend", "aamir");
		System.out.println(c);
	} 

}
