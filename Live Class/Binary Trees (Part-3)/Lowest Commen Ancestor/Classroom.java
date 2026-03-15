import java.util.ArrayList;

public class Classroom {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Helper method to find path from root to a given node
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        // Check left and right subtrees
        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        // Backtrack if not found
        path.remove(path.size() - 1);
        return false;
    }

    // Lowest Common Ancestor using path method
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null; // If either node not found
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i).data != path2.get(i).data) {
                break;
            }
        }

        // Last common node before mismatch
        return path1.get(i - 1);
    }

    public static void main(String[] args) {
        /*
            Tree structure:
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
        Node ancestor = lca(root, n1, n2);
        if (ancestor != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + ancestor.data);
        } else {
            System.out.println("One or both nodes not found.");
        }
    }
}
