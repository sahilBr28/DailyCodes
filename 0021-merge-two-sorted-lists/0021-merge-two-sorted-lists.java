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
        if(list1 == null && list2 == null){
            return list1;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode i = list1;
        ListNode j = list2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i;
                i = i.next;
            }else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }

        if(i == null){
            temp.next = j;
        }
        else{
            temp.next = i;
        }

        return dummy.next;

    }
}