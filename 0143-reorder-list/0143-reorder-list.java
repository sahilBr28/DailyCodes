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
    public void reorderList(ListNode head) {
        // Breaking into two list
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;

        // Reverse the list
        ListNode prev = null;
        ListNode curr = newHead;
        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        // Adding both the list
        ListNode dummy = new ListNode(-1);
        ListNode i = head;
        ListNode j = prev;
       while(i != null && j != null){
            ListNode next1 = i.next;
            ListNode next2 = j.next;

            i.next = j;
            i = next1;
            j.next = i;
            j = next2;
        }
        
    }
}