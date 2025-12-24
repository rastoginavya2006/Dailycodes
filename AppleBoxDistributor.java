import java.util.Arrays;
import java.util.Scanner;

public class AppleBoxDistributor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleBoxDistributor program = new AppleBoxDistributor();

        System.out.print("Enter the number of packs of apples: ");
        int n = scanner.nextInt();
        int[] apple = new int[n];
        System.out.println("Enter the number of apples in each pack:");
        for (int i = 0; i < n; i++) {
            apple[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of boxes: ");
        int m = scanner.nextInt();
        int[] capacity = new int[m];
        System.out.println("Enter the capacity of each box:");
        for (int i = 0; i < m; i++) {
            capacity[i] = scanner.nextInt();
        }

        int result = program.minimumBoxes(apple, capacity);
        System.out.println("Minimum boxes needed: " + result);

        scanner.close();
    }

    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = Arrays.stream(apple).sum();

        int[] fq = new int[51];
        int high = 0, low = 51;
        for (int c : capacity) {
            fq[c]++;
            high = Math.max(high, c);
            low = Math.min(low, c);
        }

        int res = 0;
        for (int i = high; i >= low && sum > 0; i--) {
            while (fq[i]-- > 0 && sum > 0) {
                sum -= i;
                res++;
            }
        }

        return res;
    }
}