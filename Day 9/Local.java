class Outer {
    void display() {

        class LocalInner {
            void message() {
                System.out.println("Inside method");
            }
        }

        LocalInner obj = new LocalInner();
        obj.message();
    }
}

public class Local {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}