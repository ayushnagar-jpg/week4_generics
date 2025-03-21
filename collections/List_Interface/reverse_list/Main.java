package collections.List_Interface.reverse_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Test with ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        ReverseList.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Test with LinkedList
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        ReverseList.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
