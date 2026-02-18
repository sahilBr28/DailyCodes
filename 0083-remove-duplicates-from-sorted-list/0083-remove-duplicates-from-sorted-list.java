class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        ListNode i = head;
        ListNode j = head;
        while(j != null){
            if(j.val != i.val){//attach
                i.next = j;
                i = j;
            }
            j = j.next;
        }
        i.next = null;
        return head;
    }
}