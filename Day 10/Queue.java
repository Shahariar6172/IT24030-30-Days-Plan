import java.util.*;

public class Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.poll()); // removes first element
    }
}