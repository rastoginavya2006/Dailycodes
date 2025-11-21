
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {

    // Helper function to insert a node into the BST
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to perform Breadth-First Search (Level Order Traversal)
    public static void bfs(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean first = true;

        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            // Print space before element only if it's not the first element
            // This ensures no trailing space at the end
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(curr.data);
            first = false;

            // Enqueue left child
            if (curr.left != null) {
                queue.add(curr.left);
            }
            // Enqueue right child
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        // Read n integers and insert them into the BST
        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();
            root = insert(root, val);

        }

        // Perform and print BFS traversal
        bfs(root);

        sc.close();
    }
}