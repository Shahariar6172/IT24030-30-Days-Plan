import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate (will be ignored)

        // Display HashSet
        System.out.println("HashSet: " + hashSet);

        // Check element
        System.out.println("Contains Apple? " + hashSet.contains("Apple"));

        // Remove element
        hashSet.remove("Banana");

        // Loop through HashSet
        System.out.println("Updated HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Apple"); // Duplicate ignored

        // Display TreeSet (sorted)
        System.out.println("\nTreeSet: " + treeSet);

        // First and Last element
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());

        // Remove element
        treeSet.remove("Banana");

        // Loop through TreeSet
        System.out.println("Updated TreeSet:");
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}