// class Solution {

//     public ListNode flattenLinkedList(ListNode head) {

//         if (head == null) return null;

//         ArrayList<Integer> list = new ArrayList<>();

//         // Step 1: Store all values
//         ListNode temp = head;

//         while (temp != null) {

//             ListNode down = temp;

//             while (down != null) {
//                 list.add(down.val);
//                 down = down.child;
//             }

//             temp = temp.next;
//         }

//         // Step 2: Sort
//         Collections.sort(list);

//         // Step 3: Create flattened linked list
//         ListNode dummy = new ListNode(-1);
//         ListNode curr = dummy;

//         for (int num : list) {
//             curr.child = new ListNode(num);
//             curr = curr.child;
//         }

//         return dummy.child;
//     }
// }