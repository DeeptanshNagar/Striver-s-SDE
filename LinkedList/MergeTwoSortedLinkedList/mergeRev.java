import java.util.*;

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
public class mergeRev {
    public static Node convertArrListtoLL(ArrayList<Integer> arr) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        for (int i = 0; i < arr.size(); i++) {
            temp.next = new Node(arr.get(i));
            temp = temp.next;
        }
        return dummyNode.next;

    }
    public static Node convertLLtoArrayList(Node list1, Node list2) {
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
        Collections.sort(arr);
        Node head = convertArrListtoLL(arr);
        return head;
    }
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);

        Node list2 = new Node(4);
        list2.next = new Node(5);
        list2.next.next = new Node(6);

        Node mergeList = convertLLtoArrayList(list1, list2);
        printLinkedList(mergeList);

    }
}