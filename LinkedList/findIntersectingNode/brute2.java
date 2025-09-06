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
public class brute2 {
    public static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node areTheyIntersect(Node head1, Node head2) {
        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void printLinkList(Node head) {
        while(head.next != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print(head.data + " -> ");
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;

        Node secHead = null;
        secHead = insertNode(secHead, 3);
        Node head2 = secHead;
        secHead.next = head;
        printLinkList(head2);
        
        Node connection = areTheyIntersect(head1, head2);
        if(connection == null) {
            System.out.println("bhag yaha se");
        } else {
            System.out.println(connection.data);
        }
    }
}
