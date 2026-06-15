import java.util.Scanner;
import java.util.Arrays;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] strengths = new int[n];
            
            for (int i = 0; i < n; i++) {
                strengths[i] = sc.nextInt();
            }
            
            Arrays.sort(strengths);
            
            int minDiff = Integer.MAX_VALUE;
            
            for (int i = 1; i < n; i++) {
                int diff = strengths[i] - strengths[i - 1];
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
            
            System.out.println(minDiff);
        }
        
        sc.close();
    }
}
