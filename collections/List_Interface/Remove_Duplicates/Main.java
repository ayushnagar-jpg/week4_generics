package collections.List_Interface.Remove_Duplicates;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Test case
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + numbers);

        // Remove duplicates
        List<Integer> uniqueList = DuplicateRemover.removeDuplicates(numbers);
        
        // Print result
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
