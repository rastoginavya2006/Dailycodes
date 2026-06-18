import java.util.Scanner;
import java.util.Arrays;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                
                int[] a = new int[n];
                int[] b = new int[n];
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                
                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }
                
                Arrays.sort(a);
                Arrays.sort(b);
                
                int bIndex = n - 1;
                for (int i = 0; i < k; i++) {
                    if (b[bIndex] > a[i]) {
                        a[i] = b[bIndex];
                        bIndex--;
                    } else {
                        break;
                    }
                }
                
                int sum = 0;
                for (int val : a) {
                    sum += val;
                }
                
                System.out.println(sum);
            }
        }
        
        sc.close();
    }
}
