interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}