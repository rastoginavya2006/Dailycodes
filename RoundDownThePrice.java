import java.util.Scanner;

public class RoundDownThePrice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                long m = sc.nextLong();
                long powerOf10 = 1;
                
                while (powerOf10 * 10 <= m) {
                    powerOf10 *= 10;
                }
                
                System.out.println(m - powerOf10);
            }
        }
        
        sc.close();
    }
}
