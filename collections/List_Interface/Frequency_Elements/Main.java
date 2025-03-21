package collections.List_Interface.Frequency_Elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Test case
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Input List: " + words);

        // Count frequency
        Map<String, Integer> frequencyMap = FrequencyCounter.countFrequency(words);

        // Print result
        System.out.println("Frequency Map: " + frequencyMap);
    }
}
