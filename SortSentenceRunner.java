import java.util.Scanner;

public class SortSentenceRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solver = new Solution();

        System.out.println("Enter the shuffled sentence:");
        String input = sc.nextLine();

        String output = solver.sortSentence(input);
        System.out.println("Result: " + output);

        sc.close();
    }
}

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for(String word: words) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '0';
            result[pos - 1] = word.substring(0, len - 1);
        }
        
        return String.join(" ", result);
    }
}