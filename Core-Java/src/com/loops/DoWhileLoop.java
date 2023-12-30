package com.loops;

// In do while loop atleast one time process will be done then it will check the condition.
public class DoWhileLoop {
	public static void main(String[] args) {

		int myNumber = 1;

		// Example of a do-while loop
		do {
			// Print the current value of myNumber
			System.out.println("My number is: " + myNumber);

			// Increment myNumber
			myNumber++;

			// Check if myNumber is less than or equal to 10
		} while (myNumber <= 10);

		System.out.println("Loop exited. Goodbye!");
	}
}
