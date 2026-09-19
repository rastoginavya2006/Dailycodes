import java.util.Scanner;

public class AngryMonk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            
            long maxPiece = 0;
            for (int i = 0; i < k; i++) {
                long a = sc.nextLong();
                if (a > maxPiece) {
                    maxPiece = a;
                }
            }
            
            long ans = 2 * (n - maxPiece) - (k - 1);
            System.out.println(ans);
        }
        
        sc.close();
    }
}
