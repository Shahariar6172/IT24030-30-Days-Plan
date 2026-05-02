import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
public static void main(String[] args) {

     ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        // Display ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Access element
        System.out.println("First Element: " + arrayList.get(0));

        // Remove element
        arrayList.remove("Banana");

        // Loop through ArrayList
        System.out.println("Updated ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Car");
        linkedList.add("Bike");
        linkedList.add("Bus");

        // Add at first and last
        linkedList.addFirst("Train");
        linkedList.addLast("Plane");

        // Display LinkedList
        System.out.println("\nLinkedList: " + linkedList);

        // Access first and last
        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());

        // Remove elements
        linkedList.remove("Bike");

        // Loop through LinkedList
        System.out.println("Updated LinkedList:");
        for (String vehicle : linkedList) {
            System.out.println(vehicle);
        }
    }
}