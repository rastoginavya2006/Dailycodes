import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            boolean hasOdd = false;
            boolean hasEven = false;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                sum += a;
                if (a % 2 != 0) {
                    hasOdd = true;
                } else {
                    hasEven = true;
                }
            }
            
            if (sum % 2 != 0 || (hasOdd && hasEven)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
