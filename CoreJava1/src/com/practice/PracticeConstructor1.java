package com.practice;
  class Computer{
   	private String Name;
	 public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	private String Address;
	 private String City;
	 private int number;
	 private int id;
	 
	public Computer(String name, String address, String city, int number, int id) {
		super();
		Name = name;
		Address = address;
		City = city;
		this.number = number;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Computer [Name=" + Name + ", Address=" + Address + ", City=" + City + ", number=" + number + ", id="
				+ id + "]";
	}
}
public class PracticeConstructor1 {
	public static void main (String[] args) {
	Computer Value1 = new Computer("Arish", "Bailey Road","Patna", 975 , 42443 );
    System.out.println(Value1);
	Value1.setName("Md Faizan khan");
	System.out.println(Value1.getName());
	}

}
