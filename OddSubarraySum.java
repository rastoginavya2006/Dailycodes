import java.util.Scanner;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            int left = i;
            int right = n - i - 1;
            
            int oddLeftCount = left / 2 + 1;       
            int oddRightCount = right / 2 + 1;     
            
            ans += arr[i] * oddLeftCount * oddRightCount;
            
            int evenLeftCount = (left + 1) / 2;    
            int evenRightCount = (right + 1) / 2;  
            
            ans += arr[i] * evenLeftCount * evenRightCount;
        }
        
        return ans;
    }
}

public class OddSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        try {
            System.out.print("Please enter the size of the array (n): ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Array size must be a positive integer.");
                    return;
                }

                int[] arr = new int[n];
                
                System.out.println("Please enter the " + n + " elements of the array:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr[i] = scanner.nextInt();
                    } else {
                        System.out.println("\nInvalid Input: Only integers are allowed. Exiting.");
                        return;
                    }
                }

                System.out.print("\nYour input array: [");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + (i < n - 1 ? ", " : ""));
                }
                System.out.println("]");
                
                int result = solution.sumOddLengthSubarrays(arr);
                System.out.println("\nThe total sum of all odd-length subarrays is: " + result);
                
            } else {
                 System.out.println("\nInvalid Input: Please enter an integer for the size.");
            }

        } finally {
            scanner.close();
        }
    }
}