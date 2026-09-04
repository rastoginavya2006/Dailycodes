import java.util.Scanner;
import java.util.HashMap;

public class ArrayCloningTechnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            HashMap<Integer, Integer> freq = new HashMap<>();
            int maxF = 0;
            
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int count = freq.getOrDefault(x, 0) + 1;
                freq.put(x, count);
                maxF = Math.max(maxF, count);
            }
            
            int c = maxF;
            int ops = 0;
            
            while (c < n) {
                ops++;
                int swaps = Math.min(c, n - c);
                ops += swaps;
                c += swaps;
            }
            
            System.out.println(ops);
        }
        
        scanner.close();
    }
}
