public class linkedList {
    static Node head;
    static boolean isCycle = false;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            isCycle = false;
            return;
        }

        // Find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove cycle
        prev.next = null;
        isCycle = false;
    }

    public static void main(String args[]) {
        // Build nodes explicitly
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head = first;
        first.next = second;
        second.next = third;
        third.next = second; // cycle created: 2 -> 3 -> 2

        isCycle = true;
        System.out.println(isCycle); // true

        removeCycle();

        System.out.println(isCycle); // false
    }
}