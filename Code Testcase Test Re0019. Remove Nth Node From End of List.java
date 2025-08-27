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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sum=0;
        ListNode cur=head;
        while(cur!=null){
            sum++;
            cur=cur.next;
        }
          if (n == sum) {
            return head.next;
        }
        cur=head;
        int k=sum-n-1;
        int i=0;
        while(i<k){
         cur=cur.next;
         i++;
        }
        cur.next=cur.next.next;
        return head;
    }
}
