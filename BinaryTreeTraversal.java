import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    Node buildTree(Scanner sc) {
        System.out.print("Enter data (-1 for no node): ");
        int val = sc.nextInt();

        if (val == -1) {
            return null;
        }

        Node newNode = new Node(val);
        System.out.println("Enter left child of " + val);
        newNode.left = buildTree(sc);
        System.out.println("Enter right child of " + val);
        newNode.right = buildTree(sc);

        return newNode;
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Build the tree");
        tree.root = tree.buildTree(sc);

        System.out.println("\nInorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);

        sc.close();
    }
}
