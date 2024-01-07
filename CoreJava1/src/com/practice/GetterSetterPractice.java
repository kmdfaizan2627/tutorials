package com.practice;
 class A{
	 private String Name;
	 private int Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
}
	}
	 

public class GetterSetterPractice {
public static void main(String[] args) {
	A obj = new A();
	obj.setName("Java");
	obj.setAge(17);
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
}
}
