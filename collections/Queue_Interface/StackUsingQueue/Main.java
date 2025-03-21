package collections.Queue_Interface.StackUsingQueue;

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Should print 3

        // Pop an element
        System.out.println("Popped element: " + stack.pop()); // Should print 3

        System.out.println("Top element after pop: " + stack.top()); // Should print 2
    }
}

