import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            long target = sum / n;
            long carry = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                carry += a[i] - target;
                
                if (carry < 0) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
