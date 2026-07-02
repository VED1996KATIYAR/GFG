/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        Node previous=null;
        Node current=head;
        HashSet<Integer> arr=new HashSet<>();
        while(current!=null){
            if(arr.contains(current.data)){
                previous.next=current.next;
            }else{
                arr.add(current.data);
                previous=current;
            }
            current=current.next;
        }
        return head;
    }
}

//hashset banao phir previous,current ka banao 