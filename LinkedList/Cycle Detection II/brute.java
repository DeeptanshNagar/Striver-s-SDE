import java.util.HashMap;

class Node {
    int data;
    Node next;   
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class brute {
    public static Node detectLoop(Node head) {
        Node temp = head;
        HashMap<Node, Integer> nodeMap = new HashMap<>();
        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return temp;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;
        node5.next = node2;
        Node head = node1;
        Node loopStartNode = detectLoop(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}