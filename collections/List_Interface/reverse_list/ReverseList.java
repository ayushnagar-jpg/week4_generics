package collections.List_Interface.reverse_list;

import java.util.List;

public class ReverseList {
    public static void reverse(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            
            left++;
            right--;
        }
    }
}
