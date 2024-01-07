package com.practice;
 class Animal{
	 void f1() {
		 System.out.println("Hello Animal1");
	 }
	 void f2() {
		 System.out.println("Hello Animal2");
	 }
 }
 class Cat extends Animal{
	 private void f3() {
System.out.println("Hello Cat");		 
	 }
 }
public class SingleLevel {
	public static void main(String[] args) {
	Cat ob = new Cat();
	ob.f1();
	ob.f2();
	

	}
		
	}