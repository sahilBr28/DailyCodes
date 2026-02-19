class Solution {
    public int Length(ListNode head){
        int len = 0;
        ListNode temp1 = head;
        while(temp1 != null){
            temp1 = temp1.next;
            len++;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int n = Length(head);
        k %= n;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        ListNode newTemp = newHead;
        while(newTemp.next != null){
            newTemp = newTemp.next;
        }
        newTemp.next = head;
        return newHead;
    }
}