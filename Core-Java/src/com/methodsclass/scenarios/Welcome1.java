package com.methodsclass.scenarios;

public class Welcome1 {
	public void f1(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("In f1() method");
	}
	
	private void f2(int c,int d)
	{
		System.out.println(c/d);
		
		f1(9,6);
		System.out.println("In f2() method");
	}
	
	public void f3()
	{
        f2(1000,11);
		f1(5,17);
		System.out.println("In f3() method");
	}
}
