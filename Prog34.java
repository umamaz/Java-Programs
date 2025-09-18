import java.util.HashMap;
import java.util.Map;

public class Prog34 {
    public static void main(String[] args) {
        // Example input array
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "apple"};

        // Call the function
        findCommonWords(words);
    }

    public static void findCommonWords(String[] words) {
        // Store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Common words:");
        boolean found = false;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {  // Appears more than once
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No common words found!");
        }
    }
}

