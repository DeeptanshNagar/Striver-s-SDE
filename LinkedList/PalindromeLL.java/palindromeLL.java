import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class palindromeLL { 

    static boolean isPalindrome(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        // Step 1: Push all nodes into the stack
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        // Step 2: Compare while traversing again
        temp = head;
        while (temp != null) {
            if (temp.data != st.peek()) {
                return false;
            }
            st.pop();
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
		// head.next.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}