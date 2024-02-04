package interview.preparation.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	Map<String, String> map = new HashMap<>(); // This is a map which will take key as String and value also String
	// Here four Employee object I have initialized with constructor using
	// parameters
	// For this I have used source-> generate constructor using field in pojo class.
	Employee obj1 = new Employee("arish", "12", "123");
	Employee obj2 = new Employee("faizan", "1", "1234");
	Employee obj3 = new Employee("harish", "14", "1235");
	Employee obj4 = new Employee("hrithik", "15", "1236");
	Employee obj100 = new Employee("hrithikkk", "15", "1236444");
	
	//obj100.getAge() ->Will not work
	

	// Here it will throw error because trying to get object related method in class and not in method
	//Employee ob9 = new Employee();
	//obj5.setName("Arish");
	//obj5.setAge("12");
	//obj5.setRoll("123");*/
	
	private void employeeObject() {
		obj100.getAge();// Here it will work
		Employee obj89 = new Employee("arish", "12", "123"); // This will not throw error - it can be done in class as well as in method.
      // object reference related method we can get only inside method.
		// Here same thing I did like from line 11 to 14 but through getter and setter method and it is always 
		// inside method , so kept in method
		Employee obj5 = new Employee(); // We have specially get non-parameterized in pojo class
		// because we have called paramaterized constructor in Pojo class
		// so we have learn in two ways we can initialize a object
		// either through getter setter method or through constructor
		obj5.setName("Arish");
		obj5.setAge("12");
		obj5.setRoll("123");
		Employee obj6 = new Employee();
		obj6.setName("faizan");
		obj6.setAge("1");
		obj6.setRoll("1234");
		Employee obj7 = new Employee();
		obj7.setName("harish");
		obj7.setAge("14");
		obj7.setRoll("1235");
		Employee obj8 = new Employee();
		obj8.setName("hrithik");
		obj8.setAge("15");
		obj8.setRoll("1236");
		map.put(obj7.getName(), obj7.getRoll());
	}
}
