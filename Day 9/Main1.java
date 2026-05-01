class Outer {
    static class Inner {
        void show() {
            System.out.println("Static inner class");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}