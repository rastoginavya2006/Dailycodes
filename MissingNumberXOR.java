import java.util.Scanner;

public class MissingNumberXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n );
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for (int num : arr) {
            xor2 ^= num;
        }

        int missingNumber = xor1 ^ xor2;
        System.out.println("Missing Number is: " + missingNumber);

        sc.close();
    }
}
