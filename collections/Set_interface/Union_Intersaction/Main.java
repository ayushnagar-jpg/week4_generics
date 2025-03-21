package collections.Set_interface.Union_Intersaction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Compute union and intersection
        Set<Integer> unionResult = SetOperations.union(set1, set2);
        Set<Integer> intersectionResult = SetOperations.intersection(set1, set2);

        // Print results
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);
    }
}
