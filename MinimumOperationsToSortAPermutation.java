import java.util.Arrays;
import java.util.Scanner;

public class MinimumOperationsToSortAPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        scanner.close();

        System.out.println("Input Array: " + Arrays.toString(nums));

        if (n <= 1) {
            System.out.println("Minimum operations required: 0");
            return; 
        }

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                pos = i;
                break;
            }
        }

        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < n; i++) {
            if (nums[(pos + i) % n] != i) {
                inc = false;
            }
            if (nums[(pos - i + n) % n] != i) {
                dec = false;
            }
        }

        int min = Integer.MAX_VALUE;

        if (inc) {
            if (pos == 0) {
                System.out.println("Minimum operations required: 0");
                return; 
            }
            int left = pos;
            int revLeft = (n - pos) + 2; 
            min = Math.min(min, Math.min(left, revLeft));
        }

        if (dec) {
            int shiftThenRev = ((pos + 1) % n) + 1;
            int revThenShift = n - pos;
            min = Math.min(min, Math.min(shiftThenRev, revThenShift));
        }

        int result = (min == Integer.MAX_VALUE) ? -1 : min;
        System.out.println("Minimum operations required: " + result);
    }
}
