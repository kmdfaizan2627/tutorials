package com.exceptionhandling;

// primitive data type can not be null
// But Object can be null
public class RuntimeException1 {
	public static void main(String[] args) {
		int a = 25;
//		int b=a/0;
//		System.out.println(b); To produce exception
		// ArithmeticException
		try {
			int b = a / 0;
			System.out.println(b);
		} catch (RuntimeException ex) {
			System.out.println("You can not divide by 0");
			ex.printStackTrace();
		}
		
		 Integer t =9;
		 int o=t;
		 System.out.println(o);
		 // ClassCastEception -> To produce Exception uncomment below 2 lines
		 //Object obj = "Hello, World!";
         //Integer intValue = (Integer) obj; 
         
         try {
             // Attempting to cast an incompatible type will result in ClassCastException
             Object obj = "Hello, World!";
             Integer intValue = (Integer) obj; // Trying to cast a String to Integer
             System.out.println("Casting successful: " + intValue);
         } catch (ClassCastException e) {
             // Catching the ClassCastException and handling it
        	 e.printStackTrace();
             System.out.println("ClassCastException caught: " + e.getMessage());
         }
		
		
//		Integer value = null;
//		System.out.println(value); To produce Null Pointer

		try {
			String value = null;
			System.out.println(value);
		} catch (Exception ex) {
			System.out.println("Value can not be null");
		}
		// NumberFormatException
		String s = "hello";
		Integer convert = Integer.valueOf(s);
		System.out.println(convert);
		
	   
	    
	}

}
