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
        if(head==null || head.next==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int idx = count - n;
        temp = dummy;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return dummy.next;    
    }
}