
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

public class optimized2 {
    public static Node insertNode(Node head, int data) {
        Node newNode = new Node(data);
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

    public static int getDifference(Node head1, Node head2) {
        int len1 = 0;
        int len2 = 0;
        while(head1 != null) {
            ++len1;
            head1 = head1.next;
        }
        while(head2 != null) {
            ++len2;
            head2 = head2.next;
        }
        return len1 - len2;
        // Positive = list1 lenght is large.
        // Negative = list2 lenght is large.
        // Zero = both LL is of equal size.
    }

    public static Node findIntersection(Node head1, Node head2) {
        int diff = getDifference(head1, head2);

        if (diff < 0) {
            while (diff++ != 0) {
                head2 = head2.next;
            }
        } else {
            while (diff-- != 0) {
                head1 = head1.next;
            }
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    public static void printLL(Node head) {
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

        printLL(head1);
        printLL(head2);
        Node intersection = findIntersection(head1, head2);
        if(intersection == null) {
            System.out.println("No intersection found!");
        } else {
            System.out.println(intersection.data);
        }
    }
}
