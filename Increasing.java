import java.util.Scanner;
import java.util.Arrays;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                
                Arrays.sort(a);
                
                boolean isStrictlyIncreasing = true;
                
                // Check for duplicates
                for (int i = 1; i < n; i++) {
                    if (a[i] == a[i - 1]) {
                        isStrictlyIncreasing = false;
                        break;
                    }
                }
                
                if (isStrictlyIncreasing) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}
