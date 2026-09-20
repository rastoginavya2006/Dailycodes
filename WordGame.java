import java.util.HashMap;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            String[][] words = new String[3][n];
            HashMap<String, Integer> wordCount = new HashMap<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    words[i][j] = sc.next();
                    wordCount.put(words[i][j], wordCount.getOrDefault(words[i][j], 0) + 1);
                }
            }

            int[] scores = new int[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    int count = wordCount.get(words[i][j]);
                    if (count == 1) {
                        scores[i] += 3;
                    } else if (count == 2) {
                        scores[i] += 1;
                    }
                }
            }
            
            System.out.println(scores[0] + " " + scores[1] + " " + scores[2]);
        }
        
        sc.close();
    }
}
