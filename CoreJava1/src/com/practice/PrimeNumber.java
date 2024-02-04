package com.practice;

public class PrimeNumber {
 public static void main(String [] args) {
	 int Value = 18 ;
	 int Count = 0;
	 for(int i =1; i<=Value;i++) {
	     if(Value % i ==0) {
	    	 Count++;
	     }
	    
 }
	 if(Count==2) {
    	 System.out.println("Prime Number");
     }
     else {
    	 System.out.println("Not a prime Number");
     }
	 
 }}
