class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int sum = 0;
        int carry = 0;

        while(l1 != null || l2 != null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            sum = val1 + val2 + carry;
            carry = sum/10;
            int digit = sum%10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            ListNode newList = new ListNode(digit);
            temp.next = newList;
            temp = temp.next;
        }
        if(carry>0) temp.next = new ListNode(carry);
        return dummy.next;
    }
}