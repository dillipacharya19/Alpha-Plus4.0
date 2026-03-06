import java.util.*;

public class QueueB {
    public static void main(String args[]) {
        // Queue q = new Queue();
        // Queue<Integer> q = new new LinkList<>();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // prints front element
            q.remove(); // removes front element
        }
    }
}