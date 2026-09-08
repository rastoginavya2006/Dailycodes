import java.util.Scanner;

public class ChoosingCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int f = scanner.nextInt();
            int k = scanner.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
           
            int favVal = a[f - 1];
            
            int greater = 0;
            int equal = 0;
            
            
            for (int i = 0; i < n; i++) {
                if (a[i] > favVal) {
                    greater++;
                } else if (a[i] == favVal) {
                    equal++;
                }
            }
            
           
            if (k <= greater) {
                System.out.println("NO");
            } else if (k >= greater + equal) {
                System.out.println("YES");
            } else {
                System.out.println("MAYBE");
            }
        }
        
        scanner.close();
    }
}
