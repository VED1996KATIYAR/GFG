/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int l1=0;
        int l2=0;
        Node temp=head1;
        while(temp!=null){
            l1+=1;
            temp=temp.next;
        }
        Node temp1=head2;
        while(temp1!=null){
            l2+=1;
            temp1=temp1.next;
        }
        Node skip=head1;
        Node skip1=head2;
        if(l1>l2){
            for(int i=1;i<=(l1-l2);i++){
                skip=skip.next;
            }
        }else{
            for(int j=1;j<=(l2-l1);j++){
                skip1=skip1.next;
            }
        }
        while(skip!=skip1){
            skip=skip.next;
            skip1=skip1.next;
        }
        return skip;
    }
}