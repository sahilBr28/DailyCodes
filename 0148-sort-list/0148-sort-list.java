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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(temp);
        return merge(head1,head2);
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        ListNode i = head1;
        ListNode j = head2;
        while(i != null && j != null){
            if(i.val >= j.val){
                k.next = j;
                j = j.next;
            }
            else{
                k.next = i;
                i = i.next;
            }
            k = k.next;
        }
        if(i == null){
            k.next = j;
        }else{
            k.next = i;
        }
        return dummy.next;
    }
}