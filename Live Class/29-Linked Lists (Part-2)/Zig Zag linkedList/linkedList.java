public class linkedList {
    Node head; // instance-level head

    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the front
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null; // break the list into two halves
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev; // head of reversed second half
        Node nextL, nextR;

        // alternate merge
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right; // link left to right
            if (nextL == null)
                break; // if left is exhausted, break
            right.next = nextL; // link right to next of left

            left = nextL; // move left pointer
            right = nextR; // move right pointer
        }

    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        // 1->2->3->4->5
        System.out.println("Original List:");
        list.print();

        list.zigZag();

        System.out.println("ZigZag List:");
        list.print();
    }

}
