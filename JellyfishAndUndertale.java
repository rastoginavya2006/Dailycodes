import java.util.Scanner;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                int n = sc.nextInt();
                
                long totalSeconds = b;
                
                for (int i = 0; i < n; i++) {
                    long x = sc.nextLong();
                   
                    totalSeconds += Math.min(x, a - 1);
                }
                
                System.out.println(totalSeconds);
            }
        }
        sc.close();
    }
}
