import java.util.*;

public class A+Bagain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Digit extraction logic
            int firstDigit = n / 10;
            int secondDigit = n % 10;
            
            System.out.println(firstDigit + secondDigit);
        }
    }
}
