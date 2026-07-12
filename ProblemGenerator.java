import java.util.Scanner;

public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            
           
            int[] counts = new int[7];

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                counts[ch - 'A']++;
            }
            
            int missingProblems = 0;
            
            for (int i = 0; i < 7; i++) {
                if (counts[i] < m) {
                    missingProblems += (m - counts[i]);
                }
            }
            
           
            System.out.println(missingProblems);
        }
        
        sc.close();
    }
}
