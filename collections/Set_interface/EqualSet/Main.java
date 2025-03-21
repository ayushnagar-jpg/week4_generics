package collections.Set_interface.EqualSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Compare sets
        boolean isEqual = SetComparator.areSetsEqual(set1, set2);
        System.out.println("Are sets equal? " + isEqual);
    }
}
