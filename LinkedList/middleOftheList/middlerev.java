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


public class middlerev {
    public static Node middleOftheList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2 + 1;
        temp = head;
        while(temp != null) {
            mid = mid - 1;
            if(mid == 0) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        Node middleNode = middleOftheList(head);
        System.out.println(middleNode.data);
    }
}
