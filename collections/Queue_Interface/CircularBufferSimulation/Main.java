package collections.Queue_Interface.CircularBufferSimulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        // Insert elements
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.displayBuffer(); // Expected: [1, 2, 3]

        // Insert 4 (Overwrites 1)
        buffer.enqueue(4);
        buffer.displayBuffer(); // Expected: [2, 3, 4]

        // Insert 5 (Overwrites 2)
        buffer.enqueue(5);
        buffer.displayBuffer(); // Expected: [3, 4, 5]
    }
}

