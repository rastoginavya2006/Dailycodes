import java.util.*;

public class ExtremelyRound  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            String s = Integer.toString(n);
            int length = s.length();
            
            int firstDigit = s.charAt(0) - '0';
            
            int ans = (length - 1) * 9 + firstDigit;
            
            System.out.println(ans);
        }
        sc.close();
    }
}
