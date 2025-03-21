package collections.Queue_Interface.reverseQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define a queue
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        Queue<Integer> reversedQueue = QueueOperations.reverseQueue(queue);

        // Print result
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}
