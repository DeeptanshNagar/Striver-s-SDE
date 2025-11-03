class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    public void enqueue(int x) {
        Node element = new Node(x);
        if (isEmpty()) {
            front = rear = element;
        } else {
            rear.next = element;
            rear = element;
        }
        System.out.println("Element enqueued: " + x);
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue from empty queue");
            return -1;
        }
        int dequeued = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dequeued;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty — no element to peek");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int queueSize() {
        return size;
    }
}

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element now: " + queue.peek());
        System.out.println("Current size: " + queue.queueSize());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}