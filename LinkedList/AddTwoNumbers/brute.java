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
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) { // carry == 1
            int sum = 0;

            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            sum = sum + carry;
            carry = sum / 10;
            Node node = new Node(sum % 10); // 7 % 10
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
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
        brute sol = new brute();
        Node l1 = new Node(2, new Node(4, new Node(3)));

        Node l2 = new Node(5, new Node(6, new Node(4)));
        
        Node result = sol.addTwoNumbers(l1, l2);
        printLL(result);
        // Node addLL = addTwoLL(list1, list2);
        // printLL(addLL);
    }
}

