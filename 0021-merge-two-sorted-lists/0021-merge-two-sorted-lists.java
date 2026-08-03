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
            if(i.val >= j.val){
                temp.next = j;
                j = j.next;
            }else{
                temp.next = i;
                i = i.next;
            }
            temp = temp.next;
        }
        if(i == null){
            temp.next = j;
        }else{
            temp.next = i;
        }
        return dummy.next;
    }
}