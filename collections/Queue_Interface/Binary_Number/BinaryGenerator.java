package collections.Queue_Interface.Binary_Number;

import java.util.*;

public class BinaryGenerator {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String current = queue.poll(); // Remove front element
            result.add(current); // Store the binary number

            // Generate next two binary numbers and add them to the queue
            queue.offer(current + "0");
            queue.offer(current + "1");
        }

        return result;
    }
}
