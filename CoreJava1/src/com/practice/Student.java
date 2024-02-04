package com.practice;
 import java.util.HashMap;
class StudentDetails{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentDetails [age=" + age + "]";
	}

	public StudentDetails(int age) {
		super();
		this.age = age;
	}

	
}
public class Student {
public static void main(String[]args) {
	HashMap<Integer,String> map = new HashMap<>();
	
	StudentDetails obj = new StudentDetails(26);
	map.put(obj.getAge(), null);
	System.out.println(map);
	
	}

}
