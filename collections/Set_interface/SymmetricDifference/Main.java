package collections.Set_interface.SymmetricDifference;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Compute symmetric difference
        Set<Integer> symmetricDiff = SetOperations.symmetricDifference(set1, set2);

        // Print result
        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}
