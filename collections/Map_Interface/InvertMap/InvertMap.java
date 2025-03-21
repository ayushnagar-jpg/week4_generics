package collections.Map_Interface.InvertMap;

import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // If value already exists, append the key to the list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }

    public static void main(String[] args) {
        // Sample input
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Invert the map
        Map<Integer, List<String>> invertedMap = invertMap(inputMap);

        // Print output
        System.out.println("Inverted Map: " + invertedMap);
    }
}
