import java.util.Scanner;

public class MaximumKToSortAPermutation {
    public static int sortPermutation(int[] nums) {
        int and = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                and = and & nums[i];
                if (and == 0) {
                    return 0;
                }
            }
        }
        return Math.max(and, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.println(sortPermutation(nums));
        
        scanner.close();
    }
}
