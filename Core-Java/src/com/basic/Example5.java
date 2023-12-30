package com.basic;

class Two{ // we can not add public with this class because it will ask creation of class file with this class name.
	static String c ="Arish";
	int a=10;
	void f2() {
		int b=20;
		System.out.println("class a    "+a);
		System.out.println(b);
	}
	void f3() {
		int a =20;
		System.out.println(a);
	}
}
public class Example5 {
	int a=100;
	public static void main(String[] args) {
		System.out.println(Two.c);
		Two obj = new Two();
		System.out.println(obj.a);
		obj.f2();
		obj.f3();
		Example5 obj2 = new Example5();
		System.out.println(obj2);
	}

}

// When JVM loads it will first serach for exact this "public static void main(String[] args)" then only program will start from here.
// If we change it to somrthing like public static void main(Integer[] args) //it will fail and will throw error . exact String[] args needed here.
// int a=10, and int a=20 is different because one is class level and one is method level.