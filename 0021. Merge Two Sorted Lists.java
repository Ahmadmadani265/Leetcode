/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            } else if (list2 == null) {
                tail.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                if (list1 != null) {
                    ListNode temp = list1;
                    list1 =list1.next;

                    temp.next = tail.next;
                    tail.next = temp;
                }
            } else {
                if (list2 != null) {
                    ListNode newNode = list2;
                    list2 = list2.next;
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            tail = tail.next;
        }
        return dummy.next;
    }
}
