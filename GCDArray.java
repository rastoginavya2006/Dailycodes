import java.util.Scanner;

public class GCDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCDArray program = new GCDArray();

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = program.findGCD(nums);
        System.out.println("The GCD of the smallest (" + getMin(nums) + 
                           ") and largest (" + getMax(nums) + ") is: " + result);

        scanner.close();
    }

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Step 1: Find the absolute minimum and maximum in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        // Step 2: Calculate GCD using the Euclidean Algorithm
        while (max != 0) {
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }

    // Helper methods for the output display
    private static int getMin(int[] nums) {
        int m = nums[0];
        for (int x : nums) if (x < m) m = x;
        return m;
    }

    private static int getMax(int[] nums) {
        int m = nums[0];
        for (int x : nums) if (x > m) m = x;
        return m;
    }
}
