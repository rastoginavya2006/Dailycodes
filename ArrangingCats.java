import java.util.Scanner;

public class ArrangingCats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String f = scanner.next();
            
            int plus = 0;
            int minus = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && f.charAt(i) == '0') {
                    plus++;
                } else if (s.charAt(i) == '0' && f.charAt(i) == '1') {
                    minus++;
                }
            }
            
            System.out.println(Math.max(plus, minus));
        }
        scanner.close();
    }
}
