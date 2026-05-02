import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueExample {
public static void main(String[] args) {
  
        Queue<String> queue = new LinkedList<>();

        // Adding elements (enqueue)
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // Peek (view front element)
        System.out.println("Front element: " + queue.peek());

        // Remove element (dequeue)
        queue.remove();
        System.out.println("After remove: " + queue);

        // Poll (removes and returns front)
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Display PriorityQueue (sorted internally)
        System.out.println("\nPriorityQueue: " + pq);

        // Peek (smallest element)
        System.out.println("Top element: " + pq.peek());

        // Remove element
        pq.poll();
        System.out.println("After poll: " + pq);
    }
}