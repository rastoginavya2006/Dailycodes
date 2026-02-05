import java.util.ArrayList;
import java.util.List;

public class MaxKDivisibleComponents {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] ans = new int[1];
        dfs(adj, values, 0, -1, ans, k);

        return ans[0];
    }

    static int dfs(List<List<Integer>> adj, int[] values, int node, int parent, int[] ans, int k) {
        int sum = values[node];

        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                sum += dfs(adj, values, neighbor, node, ans, k);
            }
        }

        if (sum % k == 0) {
            ans[0]++;
            return 0;
        }

        return sum % k;
    }
}

class Main {
    public static void main(String[] args) {
        MaxKDivisibleComponents solution = new MaxKDivisibleComponents();

        System.out.println("--- Test Cases for MaxKDivisibleComponents ---");

        int n1 = 5;
        int[][] edges1 = { { 0, 2 }, { 1, 2 }, { 3, 2 }, { 4, 2 } };
        int[] values1 = { 1, 8, 1, 4, 0 };
        int k1 = 2;
        int result1 = solution.maxKDivisibleComponents(n1, edges1, values1, k1);
        System.out.println("\nExample 1:");
        System.out.println("Values: [1, 8, 1, 4, 0], k = 2");
        System.out.println("Result: " + result1);

        int n2 = 7;
        int[][] edges2 = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 1, 4 }, { 2, 5 }, { 2, 6 } };
        int[] values2 = { 3, 0, 1, 6, 3, 2, 7 };
        int k2 = 3;
        int result2 = solution.maxKDivisibleComponents(n2, edges2, values2, k2);
        System.out.println("\nExample 2:");
        System.out.println("Values: [3, 0, 1, 6, 3, 2, 7], k = 3");
        System.out.println("Result: " + result2);
    }
}