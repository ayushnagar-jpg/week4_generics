package collections.Set_interface.Subsets;

import java.util.Set;

public class SetOperations {
    public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
        return superset.containsAll(subset); // Check if subset is contained in superset
    }
}
