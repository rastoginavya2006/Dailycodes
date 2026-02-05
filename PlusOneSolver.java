import java.util.Arrays;
import java.util.Scanner;

public class PlusOneSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlusOneSolver solver = new PlusOneSolver();

        System.out.print("Enter the number of digits: ");
        int n = scanner.nextInt();
        int[] digits = new int[n];

        System.out.println("Enter the digits separated by spaces:");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        int[] result = solver.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));

        scanner.close();
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}