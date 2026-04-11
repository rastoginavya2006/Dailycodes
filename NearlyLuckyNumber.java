import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String s = sc.next();
        int luckyCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7') {
                luckyCount++;
            }
        }

        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
