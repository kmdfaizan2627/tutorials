package interview.preparation.hashmap;

public class Employee {
	private String name;
	private String age;
	private String roll;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String age, String roll) {
		super();
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", roll=" + roll + "]";
	}
	

}
