import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

       
        String[] words = sentence.split("\\s+");

      
        HashSet<String> unique = new HashSet<>();

       
        for (String w : words) {
            unique.add(w.toLowerCase()); 
        }

        
        System.out.println("Unique words are:");
        for (String w : unique) {
            System.out.println(w);
        }

       
        System.out.println("Total unique words: " + unique.size());

        sc.close();
    }
}
