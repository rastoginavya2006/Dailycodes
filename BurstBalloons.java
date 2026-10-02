
import java.util.Arrays;

public class BurstBalloons {

    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        
        // Step 1: Create a new array with padding 1s at the boundaries
        // This prevents out-of-bounds errors and handles edge cases elegantly
        int[] arr = new int[n + 2];
        arr[0] = 1;
        arr[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }
        
        // Step 2: Initialize DP table
        // dp[i][j] represents the maximum coins collected by bursting all balloons
        // strictly between index i and index j (i and j are not bursted).
        int[][] dp = new int[n + 2][n + 2];
        
        // Step 3: Iterate over the length of the window
        // Minimum length is 3 (2 boundaries i, j + 1 balloon k in between)
        for (int len = 3; len <= n + 2; len++) {
            
            // Left boundary of the window
            for (int i = 0; i <= n + 2 - len; i++) {
                
                // Right boundary of the window
                int j = i + len - 1;
                
                // k is the index of the balloon that will be bursted LAST in this window
                for (int k = i + 1; k < j; k++) {
                    
                    // Coins gained by bursting balloon k last in this window
                    // At this point, only balloons at index i and index j are left adjacent to k
                    int coins = arr[i] * arr[k] * arr[j];
                    
                    // Total coins = coins from left sub-problem + coins from right sub-problem + current coins
                    int totalCoins = dp[i][k] + dp[k][j] + coins;
                    
                    // Store the maximum profit in the DP table
                    dp[i][j] = Math.max(dp[i][j], totalCoins);
                }
            }
        }
        
        // The answer is the maximum coins by bursting all balloons between the imaginary 1s
        return dp[0][n + 1];
    }

    // ---------------------------------------------------------
    // Main Method for Local Testing & Dry Run Verification
    // ---------------------------------------------------------
    public static void main(String[] args) {
        BurstBalloons solver = new BurstBalloons();
        
        // Test Case 1: Standard LeetCode Example
        int[] nums1 = {3, 1, 5, 8};
        System.out.println("Test Case 1 Output: " + solver.maxCoins(nums1)); 
        // Expected Output: 167
        
        // Test Case 2: The complex example we dry-ran earlier
        int[] nums2 = {9, 76, 64, 21};
        System.out.println("Test Case 2 Output: " + solver.maxCoins(nums2)); 
        // Expected Output: 116718
        
        // Test Case 3: Empty Array Edge Case
        int[] nums3 = {};
        System.out.println("Test Case 3 Output: " + solver.maxCoins(nums3)); 
        // Expected Output: 0
        
        // Test Case 4: Single Element
        int[] nums4 = {5};
        System.out.println("Test Case 4 Output: " + solver.maxCoins(nums4)); 
        // Expected Output: 5
    }
}
