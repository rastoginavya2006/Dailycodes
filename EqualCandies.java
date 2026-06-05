import java.util.Scanner;

public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            while (t-- > 0) {
                int n = sc.nextInt(); 
                int[] a = new int[n];
                
                int minCandies = Integer.MAX_VALUE;
                long totalCandies = 0; 
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    totalCandies += a[i];
                    if (a[i] < minCandies) {
                        minCandies = a[i];
                    }
                }
                
                // Total eaten is the current total minus what remains after leveling
                long totalEaten = totalCandies - ((long) n * minCandies);
                System.out.println(totalEaten);
            }
        }
        
        sc.close();
    }
}
