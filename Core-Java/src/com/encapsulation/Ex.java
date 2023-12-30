package com.encapsulation;

public class Ex { ////Pojo Class/Mpdels/Dto(Data transfer Object)
	private String name;
	private int id;
	private int age;
	private boolean owner;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isOwner() {
		return owner;
	}
	public void setOwner(boolean owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Ex [name=" + name + ", id=" + id + ", age=" + age + ", owner=" + owner + "]";
	}
	

}
