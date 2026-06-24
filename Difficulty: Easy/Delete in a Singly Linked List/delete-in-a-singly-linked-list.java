/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        int v=x-2;
        if(v==-1 ){
            head=head.next;
            return head;
        }
        Node temp=head;
        int c=0;
        while(temp!=null){
            if(v==c){
                temp.next=temp.next.next;
            }
            c++;
            temp=temp.next;
        }
        return head;
    }
}