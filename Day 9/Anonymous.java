abstract class Animal {
    abstract void sound();
}

public class Anonymous {
    public static void main(String[] args) {

        Animal a = new Animal() {
            void sound() {
                System.out.println("Anonymous sound");
            }
        };

        a.sound();
    }
}