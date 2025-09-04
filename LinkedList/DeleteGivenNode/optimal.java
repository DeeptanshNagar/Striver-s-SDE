// class Node {
//     int num;
//     Node next;

//     Node(int a) {
//         num = a;
//         next = null;
//     }
// }

// public class optimal {
//     static Node insertNode(Node head, int val) {
//         Node newNode = new Node(val);
//         if (head == null) {
//             head = newNode;
//             return head;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         return head;
//     }

//     static Node getNode(Node head, int val) {
//         if (head == null) return null;

//         while (head != null && head.num != val) {
//             head = head.next;
//         }
//         return head;
//     }

//     static void deleteNode(Node t) {
//         if (t == null || t.next == null) return;

//         t.num = t.next.num;
//         t.next = t.next.next;
//     }

//     static void printList(Node head) {
//         if (head == null) return;

//         while (head.next != null) {
//             System.out.print(head.num + " -> ");
//             head = head.next;
//         }
//         System.out.println(head.num);
//     }
   
//     public static void main(String args[]) {
//         Node head = null;
//         head = insertNode(head, 1);
//         head = insertNode(head, 4);
//         head = insertNode(head, 2);
//         head = insertNode(head, 3);
//         System.out.println("Given Linked List:");
//         printList(head);
//         Node t = getNode(head, 2);

//         deleteNode(t);

//         System.out.println("Linked List after deletion:");
//         printList(head);
//     }
// }


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
public class optimal{
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

    public static Node getNode(Node head, int data) {
        if(head == null) {
            return null;
        }
        while(head.next == null || head.data != data) {
            head = head.next;
        }
        return head;
    }
    public static void delete(Node n) {
        if(n == null || n.next == null) {
            return;
        }
        n.data = n.next.data;
        n.next = n.next.next;
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
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 4);
        head = insertNode(head, 2);
        head = insertNode(head, 6);
        System.out.println("Given Linked List");
        printLL(head);

        Node n = getNode(head, 2);
        delete(n);
        System.out.println("After deleting that one node");
        printLL(head);
    }
}