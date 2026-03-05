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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int idx = 1;
        int firstIdx = -1;
        int lastIdx = -1;
        int minDist = Integer.MAX_VALUE;
        ListNode back = head;
        ListNode curr = head.next;
        ListNode fwd = curr.next;
        if(fwd==null) return ans;
        while(fwd!=null){
            if((curr.val>back.val && curr.val>fwd.val) || (curr.val<back.val && curr.val<fwd.val)){
                if(firstIdx==-1) firstIdx = idx;
                if(lastIdx!=-1){
                    int dist = idx - lastIdx;
                    minDist = Math.min(dist,minDist);
                }
                lastIdx = idx;
            }
            idx++;
            back = back.next;
            curr = curr.next;
            fwd = fwd.next;
        }
        int maxDist = lastIdx - firstIdx;
        if(minDist==Integer.MAX_VALUE) minDist = -1;
        if(maxDist==0) maxDist = -1;
        ans[0] = minDist;
        ans[1] = maxDist;
        return ans;
    }
}