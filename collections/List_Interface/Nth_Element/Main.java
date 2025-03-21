package collections.List_Interface.Nth_Element;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2; // Find the 2nd element from the end

        System.out.println("Original List: " + list);
        String result = NthElementFinder.findNthFromEnd(list, n);
        System.out.println("Nth Element from End: " + result);
    }
}

