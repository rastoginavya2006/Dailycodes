import java.util.*;

public class BitwiseArraySolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BitwiseArraySolver solver = new BitwiseArraySolver();

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        List<Integer> nums = new ArrayList<>();
        for (String s : parts) {
            nums.add(Integer.parseInt(s));
        }

        int[] result = solver.minBitwiseArray(nums);
        System.out.println("Result: " + Arrays.toString(result));

        scanner.close();
    }

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);
            
            if (val == 2) {
                ans[i] = -1;
            } else {
                for (int b = 1; b < 31; b++) {
                    if (((val >> b) & 1) == 0) {
                        ans[i] = val ^ (1 << (b - 1));
                        break;
                    }
                }
            }
        }
        return ans;
    }
}