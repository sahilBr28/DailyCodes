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
    public boolean isPalindrome(ListNode head) {
        //We first break the Linkedlist into two diff. list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;

        //Now reversing the second list
        ListNode prev = null;
        ListNode curr = newHead;
        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        //Now checking Palindrome or not
        ListNode i = head;
        ListNode j = prev;
        while(i != null && j != null){
            if(i.val != j.val){
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}