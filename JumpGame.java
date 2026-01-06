import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JumpGame program = new JumpGame();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the jump lengths:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = program.canJump(nums);
        System.out.println("Can reach the end: " + result);

        scanner.close();
    }

    public boolean canJump(int[] nums) {
        // Start from the last index as our goal
        int goal = nums.length - 1;

        // Iterate backwards from the second-to-last element
        for (int i = nums.length - 2; i >= 0; i--) {
            // If we can jump from the current position to the goal (or beyond)
            if (i + nums[i] >= goal) {
                // Update the goal to the current position
                goal = i;
            }
        }

        // If the goal reaches the start (0), then a path exists
        return goal == 0;        
    }
}