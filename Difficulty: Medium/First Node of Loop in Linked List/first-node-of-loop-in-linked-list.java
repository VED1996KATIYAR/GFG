/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        if(head==null || head.next==null){
            return -1;
        }
        Node slow=head;
        Node fast=head;
        int counter=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                counter++;
                break;
            }
        }
        Node temp=head;
        if(counter==1){
            while(temp!=slow){
                temp=temp.next;
                slow=slow.next;
            }
        }
        return counter==1?temp.data:-1;
    }
}