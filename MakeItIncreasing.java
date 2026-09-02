import java.util.Scanner;

public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            return;
        }
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int operations = 0;
            boolean possible = true;
            
            for (int i = n - 2; i >= 0; i--) {
                while (a[i] >= a[i + 1] && a[i] > 0) {
                    a[i] /= 2;
                    operations++;
                }
                
                if (a[i] >= a[i + 1]) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println(operations);
            } else {
                System.out.println("-1");
            }
        }
        
        sc.close();
    }
}
