import java.util.Scanner;

public class PermutationGenerator {

    static class Solution {
        public int[] diStringMatch(String s) {
            int n = s.length();
            int ans[] = new int[n + 1];
            int min = 0;
            int max = n;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == 'I') {
                    ans[i] = min++;
                } else {
                    ans[i] = max--;
                }
            }
            ans[n] = min;
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("DI String Match Solver");
        System.out.print("Enter the constraint string (S) consisting of 'I' and 'D': ");
        String userInput = scanner.nextLine();

        if (userInput.isEmpty()) {
            System.out.println("Error: Input string cannot be empty.");
            scanner.close();
            return;
        }

        int[] result = sol.diStringMatch(userInput);

        System.out.println("Input String: \"" + userInput + "\"");
        System.out.print("Resulting Permutation: [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        scanner.close();
    }
}