import java.util.*;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> counts = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                counts.put(a[i], counts.getOrDefault(a[i], 0) + 1);
            }

            int spyValue = -1;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() == 1) {
                    spyValue = entry.getKey();
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == spyValue) {
                    System.out.println(i + 1); 
                    break;
                }
            }
        }
        sc.close();
    }
}
