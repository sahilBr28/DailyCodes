public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode i = head;
        ListNode j = head;
      
        while(j!= null && j.next!=null){
            i = i.next;
            j = j.next.next;

            if(i==j){
                i = head;
                while(i!=j){
                    i = i.next;
                    j = j.next;
                }
                return i;
            }   
        }
        return null;


    }
}