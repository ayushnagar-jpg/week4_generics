package collections.List_Interface.Rotate_Elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Test case
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2; // Rotate by 2 positions

        System.out.println("Original List: " + numbers);
        ListRotator.rotateList(numbers, k);
        System.out.println("Rotated List: " + numbers);
    }
}
