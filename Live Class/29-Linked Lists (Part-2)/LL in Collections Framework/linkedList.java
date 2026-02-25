import java.util.LinkedList; //JCF

public class linkedList {
    public static void main(String args[]) {
        // Create a LinkedList of integers
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements to the LinkedList
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}