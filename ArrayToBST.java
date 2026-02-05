import java.util.Scanner;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ArrayToBST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayToBST program = new ArrayToBST();

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements (must be in sorted order):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        TreeNode root = program.sortedArrayToBST(nums);
        
        System.out.println("Binary Search Tree created. (In-order traversal):");
        program.printInOrder(root);
        
        scanner.close();
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);        
    }

    private TreeNode convert(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        
        // Pick the middle element to ensure the tree is height-balanced
        int mid = left + (right - left) / 2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        // Recursively build the left and right subtrees
        node.left = convert(nums, left, mid - 1);
        node.right = convert(nums, mid + 1, right);
        
        return node;
    }

   
    private void printInOrder(TreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}