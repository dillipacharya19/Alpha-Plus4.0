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

    // Transform tree into sum tree
    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = transform(root.left);
        int rightSum = transform(root.right);

        int oldValue = root.data;
        root.data = leftSum + rightSum; // replace node with sum of children

        return root.data + oldValue; // return total sum including itself
    }

    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
            Original Tree:
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7

            After transform (sum tree):
                 27
               /    \
              9      13
             / \    /  \
            0   0  0    0
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        System.out.println("Preorder traversal of transformed tree:");
        preorder(root);
    }
}
