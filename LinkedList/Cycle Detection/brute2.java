import java.util.HashMap;

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

    public static boolean detectLoop(Node head) {
        HashMap<Node,Boolean> hshMap = new HashMap<>();
        Node temp = head;
        while(temp.next != null) {
            if(hshMap.containsKey(temp)) {
                return true;
            }
            hshMap.put(temp, true);
            temp = temp.next;
        }
        return false;
    }

    // If a linked list contains a cycle, then any naive traversal like:
    /*
        Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
        will result in an infinite loop because:

        Normally, the traversal ends when temp becomes null.

        But in a cyclic list, temp never reaches null — it keeps looping around inside the cycle.
     */

    public static void printLL(Node head) {
        while(head.next != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print(head.data + " -> ");
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }

}