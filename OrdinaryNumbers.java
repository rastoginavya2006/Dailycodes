import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            
            for (long base = 1; base <= n; base = base * 10 + 1) {
                for (int d = 1; d <= 9; d++) {
                    if (base * d <= n) {
                        count++;
                    } else {
                        break; 
                    }
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
