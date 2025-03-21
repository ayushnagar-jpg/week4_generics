package collections.List_Interface.Rotate_Elements;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListRotator {
    public static void rotateList(List<Integer> list, int k) {
        int n = list.size();
        if (n == 0) return;
        
        k = k % n; // Handle cases where k > n
        if (k == 0) return; // No rotation needed

        // Reverse three parts to achieve rotation
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    private static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            Collections.swap(list, start, end);
            start++;
            end--;
        }
    }
}
