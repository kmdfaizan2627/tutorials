package com.practice;

public class ConstructorOverloading {

	private String Name;
	private int Age;
	
	public ConstructorOverloading() {
		this.Name="Arish";
		this.Age= 25;
	}
	public static void main (String[] args) {
		ConstructorOverloading ob = new ConstructorOverloading();
		System.out.println("ConstructorOverloading 1  " + ob.Name+" "+ob.Age);
	}
}
