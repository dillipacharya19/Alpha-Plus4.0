public class linkList {
    // Define Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head pointer
    static Node head;

    // Cycle detection using Floyd’s algorithm

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false; // No cycle found

    }

    public static void main(String[] args) {
        // Example usage
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creates a cycle
        // 1->2->3->1
        System.out.println(isCycle()); // Output: true
    }

}