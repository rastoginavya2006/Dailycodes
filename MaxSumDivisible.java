import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSumDivisible {

    public static void main(String[] args) {
        
        int[] nums = {3, 6, 5, 1, 8};
        
      
        int result = maxSumDivThree(nums);
        
       
        System.out.println("Maximum Sum Divisible by 3 is: " + result);
    }

    public static int maxSumDivThree(int[] nums) {
        int totalSum = 0;
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for (int num : nums) {
            totalSum += num;
            if (num % 3 == 1) {
                ones.add(num);
            } else if (num % 3 == 2) {
                twos.add(num);
            }
        }

        int remainder = totalSum % 3;

        if (remainder == 0) return totalSum;

        Collections.sort(ones);
        Collections.sort(twos);

        int ans = 0;

        if (remainder == 1) {
            if (ones.size() >= 1) {
                ans = Math.max(ans, totalSum - ones.get(0));
            }
            if (twos.size() >= 2) {
                ans = Math.max(ans, totalSum - twos.get(0) - twos.get(1));
            }
        } 
        else if (remainder == 2) {
            if (twos.size() >= 1) {
                ans = Math.max(ans, totalSum - twos.get(0));
            }
            if (ones.size() >= 2) {
                ans = Math.max(ans, totalSum - ones.get(0) - ones.get(1));
            }
        }

        return ans;
    }
}