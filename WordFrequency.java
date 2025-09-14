import java.util.*;

class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter a sentence/paragraph: ");
        String text = sc.nextLine();

    
        String[] words = text.split("\\s+"); // multiple spaces handle करेगा

    
        HashMap<String, Integer> map = new HashMap<>();

 
        for (String word : words) {
            word = word.toLowerCase(); // case insensitive
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

 
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

 
        String maxWord = "";
        int maxFreq = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxWord = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        System.out.println("\nMost frequent word: " + maxWord + " -> " + maxFreq + " times");
        sc.close();
    }
}
