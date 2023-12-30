package com.inheritance;
// We have class A2 and B2 and there we have f1() method in common but both have different body so compiler will get confused that
//which f1() method you are trying to call with oj.f1() so it is not allowed in Java
class A2{
	void f2() {
		System.out.println("Hello");
	}
}
class B2{
	void f2(){
		System.out.println("Hii");
	}
}

class C2 extends A2,B2{   // This is not allowed in Java due to ambiguity issue.

	
}
public class InheritanceAmbiguity {
	public static void main(String[] args) {
	    C2 oj = new C2();
	    oj.f2(); // Which f2() is getting called so compiler will fail due to ambiguity issue.

	}
 
}
