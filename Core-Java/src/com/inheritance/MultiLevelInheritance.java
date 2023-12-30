package com.inheritance;

//Grandparent class
class Animals1 {
 void eat() {
     System.out.println("Animal is eating");
 }

 void sleep() {
     System.out.println("Animal is sleeping");
 }
}

//Parent class inheriting from the Animal class
class Dogs1 extends Animals1 {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Child class inheriting from the Dog class
class Bulldog extends Dogs1 {
 void guard() {
     System.out.println("Bulldog is guarding");
 }
}

public class MultiLevelInheritance {
 public static void main(String[] args) {
     // Creating an instance of the Bulldog class
     Bulldog myBulldog = new Bulldog();

     // Accessing methods from the grandparent class (Animal)
     myBulldog.eat();
     myBulldog.sleep();

     // Accessing methods from the parent class (Dog)
     myBulldog.bark();

     // Accessing method from the child class (Bulldog)
     myBulldog.guard();
 }
}

