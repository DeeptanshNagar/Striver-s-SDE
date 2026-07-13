class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next, ListNode child) {
        this.val = val;
        this.next = next;
        this.child = child;
    }
}

public class flatenLL {

    public ListNode flattenLinkedList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        // Recursively flatten the remaining list
        ListNode mergeHead = flattenLinkedList(head.next);

        // Merge current list with the flattened list
        return merge(head, mergeHead);
    }

    private ListNode merge(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                tail.child = a;
                a = a.child;
            } else {
                tail.child = b;
                b = b.child;
            }

            tail = tail.child;

            // Remove next pointers in the flattened list
            tail.next = null;
        }

        if (a != null)
            tail.child = a;
        else
            tail.child = b;

        return dummy.child;
    }

    // Optional: Driver code for testing
    public static void main(String[] args) {

        // Create sample linked list here if you want to test
        flatenLL list = new flatenLL();

        // Example:
        // ListNode head = ...
        // ListNode result = sol.flattenLinkedList(head);
    }
}