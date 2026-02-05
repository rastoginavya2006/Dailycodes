import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSumRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of candidates: ");
        int n = sc.nextInt();
        int[] candidates = new int[n];

        System.out.println("Enter " + n + " numbers (separated by space):");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        Solution solver = new Solution();
        List<List<Integer>> result = solver.combinationSum(candidates, target);

        System.out.println("Result Combinations: " + result);
        
        sc.close();
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        makeCombination(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;        
    }

    private void makeCombination(int[] candidates, int target, int idx, List<Integer> comb, int total, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || idx >= candidates.length) {
            return;
        }

        comb.add(candidates[idx]);
        makeCombination(candidates, target, idx, comb, total + candidates[idx], res);
        comb.remove(comb.size() - 1);
        makeCombination(candidates, target, idx + 1, comb, total, res);
    }    
}