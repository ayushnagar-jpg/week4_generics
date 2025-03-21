package collections.List_Interface.Nth_Element;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFinder {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();
        
        // Move the fast pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return "N is larger than the list size!";
            }
        }

        // Move both pointers one step at a time
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next(); // slow now points to the Nth element from the end
    }
}
