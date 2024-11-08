class Queue {
    private int front, rear, size;
    private int[] queue;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size < queue.length) {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
            if (front == -1) front = 0;
        } else System.out.println("Queue overflow");
    }

    public int dequeue() {
        if (size > 0) {
            int value = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return value;
        } else return -1;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}

class ArrayQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
