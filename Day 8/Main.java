abstract class Animal {

    // abstract method (no body)
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();  // implementation
        d.sleep();  // inherited method
    }
}