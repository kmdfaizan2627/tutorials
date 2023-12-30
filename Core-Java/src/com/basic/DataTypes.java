package com.basic;

public class DataTypes {
	char charNumric = 16;
	Character charNumricchar = Character.valueOf(charNumric);
	
	byte byteNumric = 8;
	Byte byteNumricbyte = Byte.valueOf(byteNumric);
	
	short shortNumric = 16; // 16 bit
	Short shortNumericShort = Short.valueOf(shortNumric);
	
	int numeric = 6; //8 bit
	Integer numbericObject = Integer.valueOf(numeric); // Wrapper is just like covering layer of primitive data type.
	

	long longNumric =64 ;
	Long longNumriclong = Long.valueOf(longNumric);
	

	float floatNumric = 32;
	Float floateNumricfloat = Float.valueOf(floatNumric);
	
	double doubleNumric = 64;
	Double doubleNumricdouble = Double.valueOf(doubleNumric);
	
	boolean booleanNumric = true;
	Boolean bolleanNumricboolean = Boolean.valueOf(booleanNumric);
}

// OOPS Principles
// In Java programming, OOPS (Object-Oriented Programming) principles are fundamental concepts that help to design and organize code in a modular and reusable way.
// The four main principles of OOPS are:
// 1. Encapsulation
//  In simple terms, encapsulation in Java involves binding the data (attributes) and methods (functions) into a single unit, known as a class. 
//  The idea of Encapsulation is to restrict direct access to some of an object's components and only allow access through the object's methods. 
//  This helps in hiding the internal details of how an object works and allows for better control and flexibility.
// Example -

public class Student {
    private String name;  // private attribute

    // Getter method for the private attribute
    public String getName() {
        return name;
    }

    // Setter method for the private attribute
    public void setName(String name) {
        this.name = name;
    }

    // Other methods can also be defined here
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student = new Student();

        // Using the public methods to access and modify the private attribute
        student.setName("John Doe");
        System.out.println("Student Name: " + student.getName());
    }
}

//In above example:

//The name attribute is declared as private, meaning it can only be accessed within the Student class.
//Getter (getName()) and setter (setName()) methods are provided to access and modify the name attribute from outside the class.
//Security: By restricting direct access to certain components, you can prevent unintended interference and ensure proper usage.

//2. Inheritance
//It is concept where attributes and methods of Parent class can be accessed by Child class.
//Inheritance is a fundamental concept in object-oriented programming that allows a new class to inherit attributes and behaviors from an existing class.

//Example -
// Parent class(Superclass)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Accessing methods from the superclass
        myDog.eat();   // Inherited from Animal
        myDog.sleep(); // Inherited from Animal

        // Accessing method from the subclass
        myDog.bark();  // Defined in Dog class
    }
}
// In above example:
//Animal is the superclass or parent class, and it has methods eat() and sleep().
//Dog is the subclass(child class) that extends Animal, which means it inherits the eat() and sleep() methods.
//Dog also has its own method bark().

//3.Abstraction and 4. Polymorphism in next.
