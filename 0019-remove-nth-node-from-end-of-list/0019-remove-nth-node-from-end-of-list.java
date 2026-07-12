class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        int count = 0;

        while(temp != null){
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