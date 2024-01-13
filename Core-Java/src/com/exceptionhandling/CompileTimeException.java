package com.exceptionhandling;

public class CompileTimeException {
	public static void main(String[] args)  {
		final String CLASS_TO_LOAD = "main.java.Utils";
		// Class loadedClass = Class.forName(CLASS_TO_LOAD); //
		
		try {
			Class loadedClass = Class.forName(CLASS_TO_LOAD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Class loadedClass = Class.forName(CLASS_TO_LOAD);
		
	}
}
