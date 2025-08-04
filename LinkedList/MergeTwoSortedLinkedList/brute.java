import java.util.ArrayList;
import java.util.Collections;

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

    static Node convertArrToLinkedList(ArrayList<Integer> arr) {

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        for (int i = 0; i < arr.size(); i++) {
            temp.next = new Node(arr.get(i));
            temp = temp.next;
        }
        return dummyNode.next;
    }

    static Node sortTwoLinkedLists(Node list1, Node list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp1 = list1;
        Node temp2 = list2;

        while (temp1 != null) {
            arr.add(temp1.data);

            temp1 = temp1.next;
        }

        while (temp2 != null) {
            arr.add(temp2.data);
            temp2 = temp2.next;
        }

        Collections.sort(arr);

        Node head = convertArrToLinkedList(arr);

        return head;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);

        Node mergedList = sortTwoLinkedLists(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}