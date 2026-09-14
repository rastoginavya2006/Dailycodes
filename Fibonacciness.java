import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a4 = scanner.nextInt();
            int a5 = scanner.nextInt();
            
            int[] candidates = {
                a1 + a2,
                a4 - a2,
                a5 - a4
            };
            
            int maxFib = 0;
            for (int a3 : candidates) {
                int count = 0;
                if (a3 == a1 + a2) count++;
                if (a4 == a2 + a3) count++;
                if (a5 == a3 + a4) count++;
                maxFib = Math.max(maxFib, count);
            }
            System.out.println(maxFib);
        }
        scanner.close();
    }
}
