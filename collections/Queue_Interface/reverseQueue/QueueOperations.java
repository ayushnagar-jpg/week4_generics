package collections.Queue_Interface.reverseQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings("unused")
public class QueueOperations {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue elements from queue and push to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Pop elements from stack and enqueue back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}

