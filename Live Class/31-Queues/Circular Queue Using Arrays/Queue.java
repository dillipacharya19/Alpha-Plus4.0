public class Queue {
    static class QueueB {
        int arr[];
        int size;
        int rear;
        int front;

        QueueB(int n) {
            arr = new int[n];
            size = 0;
            rear = -1;
            front = -1;
        }

        public boolean isFull() {
            return size == arr.length;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
            size++;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            front = (front + 1) % arr.length;
            size--;
            if (size == 0) {
                front = rear = -1; // reset
            }
            return result;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        QueueB q = new QueueB(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}