import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class HighestAchievableSum {

    static int maxRes = Integer.MIN_VALUE;

    public static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        int ls = solve(root.left);
        int rs = solve(root.right);
        if (root.left != null && root.right != null) {
            maxRes = Math.max(maxRes, ls + rs + root.data);
            return Math.max(ls, rs) + root.data;
        }
        if (root.left != null) {
            return ls + root.data;
        }
        return rs + root.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        if (line.trim().isEmpty())
            return;

        String[] tokens = line.trim().split("\\s+");

        if (tokens.length == 0 || tokens[0].equals("-1") || tokens[0].equals("null")) {
            return;
        }

        Node root = new Node(Integer.parseInt(tokens[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < tokens.length && !queue.isEmpty()) {
            Node curr = queue.poll();

            // Stop if we hit the terminator explicitly
            if (tokens[i].equals("-1"))
                break;

            // Process Left Child
            if (!tokens[i].equals("null")) {
                curr.left = new Node(Integer.parseInt(tokens[i]));
                queue.add(curr.left);
            }
            i++;

            if (i >= tokens.length || tokens[i].equals("-1"))
                break;

            // Process Right Child
            if (!tokens[i].equals("null")) {
                curr.right = new Node(Integer.parseInt(tokens[i]));
                queue.add(curr.right);
            }
            i++;
        }

        maxRes = Integer.MIN_VALUE;

        solve(root);

        if (maxRes == Integer.MIN_VALUE) {

            System.out.println("No path between two leaves found");
        } else {
            System.out.println(maxRes);
        }
    }
}