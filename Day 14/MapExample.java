import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExample {
public static void main(String[] args) {
  
  HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put(3, "Mango");
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(1, "Orange"); // Replaces value of key 1

        // Display HashMap
        System.out.println("HashMap: " + hashMap);

        // Access value
        System.out.println("Value for key 2: " + hashMap.get(2));

        // Remove element
        hashMap.remove(3);

        // Loop through HashMap
        System.out.println("Updated HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put(3, "Mango");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        // Display TreeMap (sorted by key)
        System.out.println("\nTreeMap: " + treeMap);

        // First and Last key
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // Remove element
        treeMap.remove(2);

        // Loop through TreeMap
        System.out.println("Updated TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}