import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java"); // duplicate allowed

        System.out.println(list);
    }
}