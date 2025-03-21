package collections.Set_interface.EqualSet;

import java.util.Set;

public class SetComparator {
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2); // Checks for equality irrespective of order
    }
}
