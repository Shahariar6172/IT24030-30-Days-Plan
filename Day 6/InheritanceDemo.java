// Base class (Parent class)
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void eat() {
        System.out.println(name + " is eating.");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class (Child class) - inherits from Animal
class Dog extends Animal {
    String breed;

    // Constructor
    Dog(String name, int age, String breed) {
        super(name, age); // Call parent constructor
        this.breed = breed;
    }

    // Method specific to Dog
    void bark() {
        System.out.println(name + " is barking!");
    }

    // Method Overriding
    @Override
    void display() {
        super.display(); // Call parent method
        System.out.println("Breed: " + breed);
    }
}

// Another child class
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void meow() {
        System.out.println(name + " says Meow!");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {

        // Parent object
        Animal animal = new Animal("Generic Animal", 5);
        animal.eat();
        animal.display();

        System.out.println("-------------------");

        // Child object (Dog)
        Dog dog = new Dog("Buddy", 3, "Labrador");
        dog.eat();      // Inherited from Animal
        dog.bark();     // Dog's own method
        dog.display();  // Overridden method

        System.out.println("-------------------");

        // Child object (Cat)
        Cat cat = new Cat("Whiskers", 2);
        cat.eat();      // Inherited from Animal
        cat.meow();     // Cat's own method
        cat.display();  // Inherited from Animal
    }
}