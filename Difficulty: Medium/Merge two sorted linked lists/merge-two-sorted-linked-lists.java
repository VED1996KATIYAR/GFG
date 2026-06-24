/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy=new Node(-1);
        Node k=dummy;
        Node i=head1;
        Node j=head2;
        while(i!=null && j!=null){
            if(i.data==j.data){
                Node a=new Node(i.data);
                k.next=a;
                k=k.next;
                Node b=new Node(j.data);
                k.next=b;
                i=i.next;
                j=j.next;
            }
            else if(i.data<j.data){
                Node a=new Node(i.data);
                k.next=a;
                i=i.next;
            }else{
                Node b=new Node(j.data);
                k.next=b;
                j=j.next;
            }
            k=k.next;
            
        }
        if(i==null){
            k.next=j;
        }else{
            k.next=i;
        }
        return dummy.next;
    }
}