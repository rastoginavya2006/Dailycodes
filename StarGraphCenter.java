import java.util.Scanner;

public class StarGraphCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StarGraphCenter solver = new StarGraphCenter();

        System.out.println("A star graph has n nodes and n-1 edges.");
        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();

        int[][] edges = new int[numEdges][2];
        System.out.println("Enter the edges (pairs of nodes):");
        for (int i = 0; i < numEdges; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        int center = solver.findCenter(edges);
        System.out.println("The center of the star graph is node: " + center);

        scanner.close();
    }

    public int findCenter(int[][] edges) {
        // The center node must be present in every edge.
        // We only need to check the first two edges to find the common node.
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        int d = edges[1][1];

        // If 'a' is in the second edge, 'a' is the center.
        // Otherwise, 'b' must be the center.
        if (a == c || a == d) {
            return a;
        }
        return b;
    }
}