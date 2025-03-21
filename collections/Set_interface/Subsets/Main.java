package collections.Set_interface.Subsets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Check if set1 is a subset of set2
        boolean isSubset = SetOperations.isSubset(set1, set2);

        // Print result
        System.out.println("Is Set 1 a subset of Set 2? " + isSubset);
    }
}

