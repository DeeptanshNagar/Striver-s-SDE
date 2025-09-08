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

public class brute {
    public static boolean detectLoop(Node head) {
        Node temp = head;
        HashMap<Node, Boolean> nodeMap = new HashMap<>();

        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            nodeMap.put(temp, true);
            temp = temp.next;
        }
        return false;
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
