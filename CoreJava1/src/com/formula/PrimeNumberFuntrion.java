
package com.formula;
import java.util.*;
public class PrimeNumberFuntrion {
	public static boolean isprime(int x){
		int i;
		for(i=2; i<=x/2; i++)
		{
			if(x%i ==0)
				break;
		}
		return i>x/2;
	}
	public static void main(String [] args) {
		Scanner S1 = new Scanner(System.in);
		int n;
		System.out.println("Enter the Number");
		n=S1.nextInt();
		if(isprime(n)) {
			System.out.println(n+ "is a prime number");
		}
		else {
			System.out.println(n+ "is not a prime number");
		}
	}
}
