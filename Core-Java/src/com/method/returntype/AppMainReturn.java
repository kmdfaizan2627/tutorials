package com.method.returntype;

public class AppMainReturn {
	public static void main(String[] args) {
		WelcomeReturn returnValue = new WelcomeReturn();
		
		int j = returnValue.f1(6);
		
		System.out.println(j);
		
		//int l = returnValue.f2(7); ->We can not do like this way because it is void
		//System.out.println(f2(7)); -> It is void type and we are already printing there in method so can't do here.
		returnValue.f2(7);
		
	   System.out.println(returnValue.f3("demo", 9));// -> It is a returned type so we can print it directly
	   String name = returnValue.f3("hello",6);// and we can assign it also to different variable
		
		System.out.println(name);
		
	}

}
