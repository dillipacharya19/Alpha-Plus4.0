import java.util.*;

public class QueueB {
    public static void interLeave(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        // Step 1: Move first half into firstHalf queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }
        // Step 2: Interleave elements
        while (!firstHalf.isEmpty()) { // add from first half

            q.add(firstHalf.remove()); // add from second half

            q.add(q.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        // print Q
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}