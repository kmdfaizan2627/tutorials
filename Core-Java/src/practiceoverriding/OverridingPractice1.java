package practiceoverriding;

class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overrides the makeSound method from the superclass
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // New method specific to the Dog class
    void wagTail() {
        System.out.println("Tail is wagging");
    }
}

// Subclass
class Cat extends Animal {
    // Overrides the makeSound method from the superclass
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }

    // New method specific to the Cat class
    void scratch() {
        System.out.println("Cat is scratching");
    }
}



public class OverridingPractice1{
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Some generic sound

        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Woof! Woof!
        myDog.wagTail();    // Output: Tail is wagging

        Cat myCat = new Cat();
        myCat.makeSound();  // Output: Meow! Meow!
        myCat.scratch();    // Output: Cat is scratching
    }
}
	 
	 
