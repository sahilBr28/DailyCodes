/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;

        Node curr = head;
        while(curr!=null){
            if(curr.child==null) curr = curr.next;
            else{
                Node fwd = curr.next;
                Node c = flatten(curr.child);
                curr.next = c;
                c.prev = curr;
                curr.child = null;
                Node temp = c;
                while(temp.next!=null) temp = temp.next;
                temp.next = fwd;
                if(fwd!=null) fwd.prev = temp;
                curr = fwd;
            }
        }
        return head;
    }
}