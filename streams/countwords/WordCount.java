package streams.countwords;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // Define file path
    	String filePath = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\countwords\\textfile.txt";

        
        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Read the file and count words
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase, remove punctuation, and split into words
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        
        // Sort words by frequency (descending order)
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display total word count
        int totalWords = wordCount.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Words: " + totalWords);

        // Display top 5 most frequent words
        System.out.println("\nTop 5 Most Frequent Words:");
        for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey() + " - " + sortedWords.get(i).getValue());
        }
    }
}
