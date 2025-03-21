package collections.Map_Interface.HighestValuePair;

import java.util.*;

public class FindMaxKey {
    public static String findMaxKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Return null if the map is empty
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        // Sample input
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Find the key with the maximum value
        String maxKey = findMaxKey(inputMap);

        // Print output
        System.out.println("Key with the highest value: " + maxKey);
    }
}
