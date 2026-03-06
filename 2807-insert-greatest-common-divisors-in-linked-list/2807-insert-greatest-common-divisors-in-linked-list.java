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
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode fwd = curr.next;
        while(fwd!=null){
            int val = gcd(curr.val,fwd.val);
            ListNode n = new ListNode(val);
            curr.next = n;
            n.next = fwd;
            curr = fwd;
            fwd = fwd.next;
        }
        return head;

    }
}