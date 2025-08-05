import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
}

public class brt {
    static Node convertArrayListToLinkedList(ArrayList<Integer> arr) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        for (int i = 0; i < arr.size(); i++) {
            temp.next = new Node(arr.get(i));

            temp = temp.next;
        }
        return dummyNode.next;
    }

    public static Node cnvToArrList(Node list1, Node list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp1 = list1;
        Node temp2 = list2;

        while(temp1 != null) {
            arr.add(temp1.data);

            temp1 = temp1.next;
        }

        while(temp2 != null) {
            arr.add(temp2.data);

            temp2 = temp2.next;
        }

        // [1, 3, 5, 2, 4, 6]
        Collections.sort(arr);

        Node head = convertArrayListToLinkedList(arr);
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        display(list1);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        display(list2);

        Node mergedList = cnvToArrList(list1, list2);
        display(mergedList);
    }
}