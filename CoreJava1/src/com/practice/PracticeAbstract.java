package com.practice;

abstract class Bank1{
	
	abstract void  pincode();
	int a = 20;

}
class Bank extends Bank1{
	void pincode() {
		System.out.println("Hello India");
 
}}
	
class Branch extends Bank1 {
	void pincode() {
	System.out.println("Pin Code is Available");
}}
class Manager extends Bank1{
	void pincode() {
		System.out.println("Hello Manager");
	}
}
public class PracticeAbstract {
	public static void main (String[] args) {
		Bank1 b1 = new Bank();
		Bank1 b2 = new Branch();
		Bank1 b3 = new Manager();
		b3.pincode();
		b1.pincode();
		b2.pincode();
		System.out.println(b1.a);
}}
	
