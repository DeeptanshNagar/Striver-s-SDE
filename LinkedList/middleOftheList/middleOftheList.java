package middleOftheList;
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class middleOftheList {
    public static Node getMiddleNode(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);

        System.out.print("Original List: ");
        display(head);

        Node middle = getMiddleNode(head);
        System.out.print("Middle Node Onward: ");
        display(middle);
    }
}
