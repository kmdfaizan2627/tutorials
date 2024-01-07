package com.string;

// String is immutable object. It means once it is initialized it can not be changed, if we try to change it then a new object gets created.
// immutable means that can not be chaged
// String constant pool String variable gets shared by all , so we can not changed or modify it.
// For str1 and str3, there will be only one object because it is created in String constant pool and both have same Afzal written.
// But for str2 one object will get created in heap and one in SCP(String Constant pool)
// SCP object is shared by everyone and it is immutable.
// Any modification with SCP object will create a new object.

public class Example1 {
	public static void main(String[] args) {
		String str1 = "Afzal"; // Here only one object will get created in String constant pool
		String str2 = new String("Khan");// In this way two objects will be created one in heap memory  and one in string constant pool
		String str3 = "Afzal";
		System.out.println(str1);
		String str4 = "Khan";
		String str5 = str1 + "Bablu";
		
	}

}
// Heap and SCP
//+ vs concat in String java
//StringBuffer vs StringBuilder
//Why String is immutable in Java
// Why all wrapper class is immutable.
// Calling non-static method or variable in inside static method.
// What do you mean by synshronization in terms of java
// example calling static inside non-static in java