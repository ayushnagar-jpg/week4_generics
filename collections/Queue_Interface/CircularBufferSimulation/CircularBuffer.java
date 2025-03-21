package collections.Queue_Interface.CircularBufferSimulation;



public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private boolean isFull;

    public CircularBuffer(int capacity) {
        this.buffer = new int[capacity];
        this.size = capacity;
        this.front = 0;
        this.rear = 0;
        this.isFull = false;
    }

    // Insert an element (Overwrites oldest if full)
    public void enqueue(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;

        if (isFull) {
            front = (front + 1) % size; // Move front forward when overwriting
        }
        
        // If rear catches front, buffer is full
        isFull = (rear == front);
    }

    // Get the current state of the buffer
    public void displayBuffer() {
        if (!isFull && rear == front) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.print("Buffer: ");
        int index = front;
        do {
            System.out.print(buffer[index] + " ");
            index = (index + 1) % size;
        } while (index != rear || (isFull && index == front));

        System.out.println();
    }
}

