class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int sum = 0;
        int carry = 0;
        while(l1 != null || l2 != null){
            int value1 = (l1 == null) ? 0:l1.val;
            int value2 = (l2 == null) ?  0:l2.val;
            sum = value1+value2+carry;
            carry = sum / 10;
            int value = sum % 10;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            temp.next = new ListNode(value);
            temp = temp.next;
        }
        if(carry>0) temp.next = new ListNode(carry);
        return dummy.next;
    }
}