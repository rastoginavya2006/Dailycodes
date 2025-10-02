
// Write a Java program that takes a sentence and counts the 
// frequency of each word using a TreeMap. Your program should: 
// 1. Treat words as case-insensitive (e.g., "Hello" and "hello" are the 
// same). 
// 2. Ignore all punctuation (e.g., commas, periods, exclamation marks, 
// etc.). 
// 3. Use a TreeMap<String, Integer> to store and display the words in 
// alphabetical order, along with their frequencies.
import java.util.*;

public class WordFrequency1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] words = sentence.split("\\s+");
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("\nWord frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }
}
