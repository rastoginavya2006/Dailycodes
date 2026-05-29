import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                
                int minIndex = 0;
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    if (a[i] < a[minIndex]) {
                        minIndex = i;
                    }
                }
                
                a[minIndex]++;
                
                int product = 1;
                for (int val : a) {
                    product *= val;
                }
                
                System.out.println(product);
            }
        }
        
        sc.close();
    }
}
