package com.formula;
import java.util.ArrayList;
class Student{
	 private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
public class StudentDetails {
	
	
	
	 
	public static void main(String[] args) {
		ArrayList<Student> lst = new ArrayList<>();
		String s;
		Student ob = new Student();
		ob.setName("Arish");
		ob.setAge(26);
		Student ob1 = new Student();
		ob1.setName("rahul");
		ob1.setAge(27);
		Student ob2 = new Student();
		ob2.setName("imran khan");
		ob2.setAge(30);
		lst.add(ob);
		lst.add(ob1);
		lst.add(ob2);
		System.out.println(lst);
		lst.remove(0);
		System.out.println(lst);
		Student value= lst.get(0);
		value.setName("kamran");
		value.setAge(28);
		System.out.println(lst);
		
		
		
		
	}

}
