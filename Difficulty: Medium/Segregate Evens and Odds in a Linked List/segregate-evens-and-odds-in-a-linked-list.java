/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
        Node dummy=new Node(-1);
        Node even=dummy;
        Node dummy1=new Node(-1);
        Node odd=dummy1;
        Node temp=head;
        while(temp!=null){
            Node tempo=new Node(temp.data);
            if(temp.data%2==0){
                even.next=tempo;
                even=even.next;
            }else{
                odd.next=tempo;
                odd=odd.next;
            }
            temp=temp.next;
        }
        odd.next=null;
        even.next=dummy1.next;
        return dummy.next;
    }
}

 //1-even
 //2-odd