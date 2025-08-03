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

public class revLL {  
    public static Node reverseLinkedList(Node head) {
        Node prev = null;   
        Node curr = head;   

        while (curr != null) {
            Node nextNode = curr.next;  // Save next
            curr.next = prev;           // Reverse link
            prev = curr;                // Move prev
            curr = nextNode;            // Move curr
        }

        return prev;  // New head
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create: 1 -> 3 -> 2 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original: ");
        printLinkedList(head);  // Prints: 1 3 2 4

        head = reverseLinkedList(head);

        System.out.print("Reversed: ");
        printLinkedList(head);  // Prints: 4 2 3 1
    }
}