// Custom Queue implementation using Array
public class Prog26 {
    private int[] arr;      // Array to store queue elements
    private int front;      // Points to the front of the queue
    private int rear;       // Points to the rear of the queue
    private int size;       // Current size of the queue
    private int capacity;   // Maximum capacity of the queue

    // Constructor
    public MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add element to the rear
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + data);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = data;
        size++;
        System.out.println(data + " enqueued.");
    }

    // Remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println(removed + " dequeued.");
        return removed;
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get current size of queue
    public int getSize() {
        return size;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(50);
        q.enqueue(60); // Queue should wrap around (circular)
        q.display();

        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.getSize());
    }
}
