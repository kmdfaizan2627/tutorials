package com.array.java;

// An array is a container object that holds a fixed number of values of same type
// We can not have different datatype in one array.
// Arrays are of fixed size. Once we have initialize we can not change it.
// Arrays are homogenous because it have only one data type in one array.
public class ArrayExample1 {
	int[] arr = { 14, 16, 3, 1, 79, 20, 7 }; // It is of int data type array.

	int[] arr1 = new int[] { 657, 84, 34, 12, 76, 89 };

	void f1() {
		for (int i = 0; i <= arr.length - 1; i++) { // arr.lenth is 7 here
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	void f2() {
		for (int i = 0; i <= arr1.length - 1; i++) { // arr.lenth is 7 here
			if (arr[i] % 2 == 0) {
				System.out.println(arr1[i]);
			}
		}
	}

	void f3() {
		String[] str = { "is", "my", "name" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	void f4() {

		String[] str = { "is", "my", "name" };

		for (String my : str) {  // For Each loop
			
			System.out.println(my);
		
		}

	}

	public static void main(String[] args) {
		ArrayExample1 obj = new ArrayExample1();
		obj.f1();
		System.out.println("<------------------------->");
		obj.f2();
		System.out.println("<-------String Array------------------>");
		obj.f3();
		System.out.println("<---------forEach loop ----------------------------->");
		obj.f4();
	}

}
