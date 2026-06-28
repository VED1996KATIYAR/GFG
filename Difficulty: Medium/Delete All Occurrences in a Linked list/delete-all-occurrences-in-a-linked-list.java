/* Structure of a linked list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/
class Solution {

    public Node deleteAllOccurances(Node head, int x) {
        // code here
        Node dum=new Node(-1);
        Node temp=dum;
        
        Node temp1=head;
        while(temp1!=null){
            if(temp1.data!=x){
                Node t=new Node(temp1.data);
                temp.next=t;
                temp=temp.next;
            }
            temp1=temp1.next;
        }
        temp.next=null;
        return dum.next;
    }
}