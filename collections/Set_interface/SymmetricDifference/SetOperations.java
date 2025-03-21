package collections.Set_interface.SymmetricDifference;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // Union of both sets

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Intersection of both sets

        union.removeAll(intersection); // Remove intersection from union to get symmetric difference
        return union;
    }
}
