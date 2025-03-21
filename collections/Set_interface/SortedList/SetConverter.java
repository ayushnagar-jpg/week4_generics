package collections.Set_interface.SortedList;

import java.util.*;

public class SetConverter {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set); // Convert Set to List
        Collections.sort(list); // Sort in ascending order
        return list;
    }
}

