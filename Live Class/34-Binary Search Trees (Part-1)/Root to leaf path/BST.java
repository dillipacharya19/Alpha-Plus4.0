import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert a value into BST
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    // Print a single path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) System.out.print(" -> ");
        }
        System.out.println("-> Null");
    }

    // Print all root-to-leaf paths
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) return;

        // Add current node to path
        path.add(root.data);

        // If leaf node, print path
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Recurse left and right
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Root-to-leaf paths:");
        printRoot2Leaf(root, new ArrayList<>());
    }
}
