class Node {
    int num;
    Node next;

    Node(int val) {
        num = val;
        next = null;
    }
}

class optimized {

    // Utility function to insert node at the end of the linked list
    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Utility function to get length difference between two lists
    static int getDifference(Node head1, Node head2) {
        int len1 = 0, len2 = 0;

        while (head1 != null || head2 != null) {
            if (head1 != null) {
                ++len1;
                head1 = head1.next;
            }
            if (head2 != null) {
                ++len2;
                head2 = head2.next;
            }
        }

        // if negative -> list2 longer, else list1 longer otherwise if zero then bohot are equal
        return len1 - len2;
    }

    // Utility function to check presence of intersection
    static Node intersectionPresent(Node head1, Node head2) {
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
            if (head1 == head2) return head1;
            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    // Utility function to print linked list
    static void printList(Node head) {
        while (head.next != null) {
            System.out.print(head.num + "->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertNode(head, 1); // 1 -> NULL
        head = insertNode(head, 3); // 1 -> 3 -> NULL
        head = insertNode(head, 1); // 1 -> 3 -> 1 -> NULL
        head = insertNode(head, 2); // 1 -> 3 -> 1 -> 2 -> NULL
        head = insertNode(head, 4); // 1 -> 3 -> 1 -> 2 -> 4 -> NULL

        Node head1 = head;
        // head = head1 = 1 -> 3 -> 1 -> 2 -> 4 -> NULL

        head = head.next.next.next;
        // head = 2 -> 4 -> NULL


        Node headSec = null;
        headSec = insertNode(headSec, 3); // headSec = 3 -> NULL
        Node head2 = headSec; // head2 = headSec = 3 -> NULL

        // Create intersection
        headSec.next = head; // head2 = headSec = 3 -> 2 -> 4 -> NULL


        
        System.out.print("List1: ");
        printList(head1);

        System.out.print("List2: ");
        printList(head2);

        // Checking if intersection is present
        Node answerNode = intersectionPresent(head1, head2);

        if (answerNode == null) {
            System.out.println("No intersection\n");
        } else {
            System.out.println("The intersection point is " + answerNode.num);
        }
    }
}
