package com.encapsulation;

// There are two ways to initialize a object either by getter setter or by using constructors.
//Default constructor already given by Java which is  unon-parameterized constructor. But if there is need to create custom constructor then
//we can create parameterized constructor.
// So constructos are of two types first is non-parameterized provided by jvm itself and second is parameterized that we create.
// Constructors are not part of Encapsulation.
// Setter Getter is part of Encapsulation.
class Encap{ //Pojo Class/Mpdels/Dto(Data transfer Object)
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
	public String toString() { // To make human readale
		return "Encap [name=" + name + ", id=" + id + ", age=" + age + ", owner=" + owner + "]";
	}
	public Encap(String name, int id, int age, boolean owner) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.owner = owner;
	}
	public Encap() { // Default constructor  is provided JVM and by default it is present but if we have created parameterized constructor
		               //then we need create
						// non parameterized constructor in java otherwise JVM will always consider parameterized constructor.
	}
	public Encap(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
}
//Encap obj = new Encap();// obj is object reference , new Encap() initializing object.
public class EncapsulationConcept {
	public static void main(String[] args) {
		Encap obj = new Encap(); // It is a non parameterized constructor. Constructor are used to initialize object
		obj.setName("Afzal");
		obj.setId(123445);
		obj.setAge(19);
		obj.setOwner(false);
		System.out.println(obj);
		System.out.println("Afzal age is "+obj.getAge());
		Encap obj1 = new Encap("Rahman", 23435446, 45, true);// At the of creating object we are initializing it also with values
		System.out.println(obj1);
		Encap obj2 = new Encap("Rahul", 50);
		System.out.println("<------>"+obj2);
		
		
		
		Ex value = new Ex();
		value.setAge(1000000000);
		System.out.println(value.getAge());
		value.setId(12345);
		System.out.println(value.getId());
		
	}

}
