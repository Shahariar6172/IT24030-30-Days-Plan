class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();

        inner.display();
    }
}