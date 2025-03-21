package collections.Set_interface.SortedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define a HashSet
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Original Set: " + set);

        // Convert Set to Sorted List
        List<Integer> sortedList = SetConverter.convertToSortedList(set);

        // Print result
        System.out.println("Sorted List: " + sortedList);
    }
}
