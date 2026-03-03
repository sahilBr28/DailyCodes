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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);

        ListNode t1 = head1;
        ListNode t2 = head2;
        int sum = 0;
        int carry = 0;
        ListNode ans = new ListNode(-1);

        while(t1!=null || t2!=null){
            if(t1!=null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2!=null){
                sum += t2.val;
                t2 = t2.next;
            }

            ans.val = sum%10;
            carry = sum/10;

            ListNode newHead = new ListNode(carry);
            newHead.next = ans;
            ans = newHead;
            sum = carry;
        }
        if(ans.val==0){
            return ans.next;
        }
        return ans;
    }
}