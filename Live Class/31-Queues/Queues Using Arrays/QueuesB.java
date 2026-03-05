public class QueuesB {
    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = 0;
            rear = -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        // add
        public void add(int data) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
            size++;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            size--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}