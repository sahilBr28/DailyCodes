public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode a = headA;
        while(a != null){
            a = a.next;
            lenA++;
        }

        int lenB = 0;
        ListNode b = headB;
        while(b != null){
            b = b.next;
            lenB++;
        }

        a = headA;      
        b = headB;

        if(lenA > lenB){
            for(int i=1;i<=lenA-lenB;i++){
                a = a.next;
            }
        }
        else{
            for(int i=1;i<=lenB-lenA;i++){
                b = b.next;
            }
        }

        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;     
    }
}