import java.util.Scanner;
import java.util.Arrays;

public class OnlyPluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            
            for (int i = 0; i < 5; i++) {
                Arrays.sort(arr);
                arr[0]++;
            }
            
            long ans = (long) arr[0] * arr[1] * arr[2];
            System.out.println(ans);
        }
        sc.close();
    }
}
