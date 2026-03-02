/**
 * Definition for singly-linked list.
 * public class ListNode { *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode reverseBetween(ListNode head, int left, int right) {
    //     if(head==null || head.next == null) return head;
    //     ListNode dummy = new ListNode(-1);
    //     dummy.next = head;
    //     ListNode prev = dummy;
    //     for(int i=1;i<left;i++){
    //         prev = prev.next;
    //     }
    //     ListNode curr = prev.next;
    //     for(int i=1;i<=right-left;i++){
    //         ListNode temp = prev.next;
    //         prev.next = curr.next;
    //         curr.next = curr.next.next;
    //         prev.next.next = temp;
    //     }
    //     return dummy.next;    
    // }

    //Method 2:
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for(int i=1;i<left;i++){
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        for(int i=1;i<=right-left+1;i++){
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;

        tail1.next = null;
        tail2.next = null;

        reverse(head2);

        tail1.next = tail2;
        head2.next = head3;

        return dummy.next;
    }
}