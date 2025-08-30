class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class revPractice {
    public static Node reverseLL(Node head) {
        Node nextHead = null;
        while(head != null) {
            Node next = head.next;
            head.next = nextHead;
            nextHead = head;
            head = next;
        }
        return nextHead;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printLL(head);

        head = reverseLL(head);
        printLL(head);
    }
}