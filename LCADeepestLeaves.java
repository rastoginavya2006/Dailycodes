import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class LCADeepestLeaves {
    int maxDepth = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LCADeepestLeaves solver = new LCADeepestLeaves();

        System.out.println("Enter tree nodes in level-order (use 'null' for empty nodes, e.g., 3 5 1 6 2 0 8):");
        String input = scanner.nextLine();
        TreeNode root = buildTree(input.split("\\s+"));

        TreeNode result = solver.lcaDeepestLeaves(root);

        System.out.println("LCA of deepest leaves value: " + (result != null ? result.val : "None"));
        scanner.close();
    }

    // Helper to build tree from level-order array input
    public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equalsIgnoreCase("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode curr = queue.poll();

            // Left Child
            if (i < nodes.length && !nodes[i].equalsIgnoreCase("null")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(curr.left);
            }
            i++;

            // Right Child
            if (i < nodes.length && !nodes[i].equalsIgnoreCase("null")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public void findDepth(TreeNode root, int depth) {
        if (root == null) return;
        maxDepth = Math.max(maxDepth, depth);
        findDepth(root.left, depth + 1);
        findDepth(root.right, depth + 1);
    }

    public TreeNode lca(TreeNode root, int depth) {
        if (root == null) return null;
        if (depth == maxDepth) return root;

        TreeNode left = lca(root.left, depth + 1);
        TreeNode right = lca(root.right, depth + 1);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) return null;
        maxDepth = 0;
        findDepth(root, 0);
        return lca(root, 0);
    }
}