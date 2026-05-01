class Solution {
    public ListNode mergeList(ListNode h1, ListNode h2){
        ListNode dummy = new ListNode(-1);
        ListNode n = dummy;
        ListNode i = h1;
        ListNode j = h2;

        while(i!=null && j!=null){
            if(i.val >= j.val){
                n.next = j;
                j = j.next;
            }else{
                n.next = i;
                i = i.next;
            }
            n = n.next;
        }
        if(i==null){
            n.next = j;
        }
        if(j==null){
            n.next = i;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast==null && fast.next==null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;

        ListNode h1 = sortList(head);
        ListNode h2 = sortList(temp);

        return mergeList(h1, h2);
    }
}