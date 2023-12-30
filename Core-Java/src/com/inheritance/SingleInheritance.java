package com.inheritance;

import com.basic.Main;

// When there is one Base(Super,Parent) class that is extended by one single child(subclass) then it is single inheritance.
//Parent class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }

 void sleep() {
     System.out.println("Animal is sleeping");
 }
}

//Child class inheriting from the Animal class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

public class SingleInheritance {
 public static void main(String[] args) {
     // Creating an instance of the Dog class
	// Dog m = new Animal(); Child class object reference can not point to Base class object
	 Animal ani = new Dog();//Base class object reference can point to child class object - 
     Dog myDog = new Dog();
       
     // Accessing methods from the parent class (Animal)
     myDog.eat();
     myDog.sleep();

     // Accessing method from the child class (Dog)
     myDog.bark();
 }
}

