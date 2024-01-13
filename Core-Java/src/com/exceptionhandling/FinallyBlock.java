package com.exceptionhandling;

// Finally block will alwayz get executed whether an exception is thrown or not
// One try block can have many catch block .. Example check on chatgpt
public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int result = 10 /0; // Division that may result in an exception
		} catch (ArithmeticException e) {
			e.getStackTrace();
		} finally {
            // This block will be executed regardless of whether an exception occurred or not
            System.out.println("Finally block: Closing resources or performing cleanup");
           // Close the scanner to prevent resource leaks
        }

	    int c =20;
	    System.out.println(c);
	}

}
