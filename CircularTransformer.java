import java.util.Scanner;
import java.util.Arrays;

public class CircularTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularTransformer solver = new CircularTransformer();

        System.out.println("Enter array elements separated by spaces:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        int[] result = solver.constructTransformedArray(nums);
        System.out.println("Transformed Array: " + Arrays.toString(result));

        scanner.close();
    }

    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int targetIdx = (i + nums[i]) % n;
            
            if (targetIdx < 0) {
                targetIdx += n;
            }
            
            result[i] = nums[targetIdx];
        }
        
        return result;
    }
}