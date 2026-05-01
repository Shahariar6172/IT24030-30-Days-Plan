class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.add(5, 3));      // int version
        System.out.println(obj.add(5.5, 2.5));  // double version
    }
}