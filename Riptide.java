import java.util.Arrays;
import java.util.Scanner;

public class Riptide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            long[] arr = new long[3];
            arr[0] = sc.nextLong();
            arr[1] = sc.nextLong();
            arr[2] = sc.nextLong();
            
            Arrays.sort(arr);
            
            long rounds = Math.min(arr[1] - arr[0], arr[2] - arr[1]);
            System.out.println(rounds);
        }
        sc.close();
    }
}
