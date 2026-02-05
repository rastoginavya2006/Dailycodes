import java.util.Scanner;

public class EncryptedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncryptedSum program = new EncryptedSum();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = program.sumOfEncryptedInt(nums);
        System.out.println("Sum of encrypted integers: " + result);

        scanner.close();
    }

    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += encrypt(i);
        }
        return sum;
    }

    private int encrypt(int n) {
        int maxDigit = 0;
        int count = 0;
        int temp = n;

        // Find the maximum digit and the number of digits simultaneously
        while (temp > 0) {
            maxDigit = Math.max(maxDigit, temp % 10);
            temp /= 10;
            count++;
        }

        // Construct the encrypted number (e.g., if max is 3 and count is 3, result is 333)
        int encryptedValue = 0;
        for (int i = 0; i < count; i++) {
            encryptedValue = encryptedValue * 10 + maxDigit;
        }

        return encryptedValue;
    }
}