/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if (head == null || head.next == null) {
            return null;
        }
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.data=slow.next.data;
        slow.next=slow.next.next;
        return head;
    }
}