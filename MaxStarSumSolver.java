import java.util.*;

public class MaxStarSumSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxStarSumSolver solver = new MaxStarSumSolver();

        System.out.println("Enter node values separated by spaces:");
        String valInput = scanner.nextLine();
        String[] valParts = valInput.split("\\s+");
        int[] vals = new int[valParts.length];
        for (int i = 0; i < valParts.length; i++) vals[i] = Integer.parseInt(valParts[i]);

        System.out.print("Enter number of edges: ");
        int m = scanner.nextInt();
        int[][] edges = new int[m][2];
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        int result = solver.maxStarSum(vals, edges, k);
        System.out.println("\nMaximum Star Sum: " + result);

        scanner.close();
    }

    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (vals[v] > 0) adj[u].add(vals[v]);
            if (vals[u] > 0) adj[v].add(vals[u]);
        }
        
        int maxStar = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            Collections.sort(adj[i], Collections.reverseOrder());
            int currentSum = vals[i];
            int limit = Math.min(adj[i].size(), k);
            for (int j = 0; j < limit; j++) {
                currentSum += adj[i].get(j);
            }
            maxStar = Math.max(maxStar, currentSum);
        }
        
        return maxStar;
    }
}