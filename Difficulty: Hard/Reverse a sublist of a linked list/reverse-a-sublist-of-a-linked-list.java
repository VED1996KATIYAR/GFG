/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseBetween(int a, int b, Node head) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Node dummy=new Node(-1);
        Node start=dummy;
        Node temp=head;
        int counter=1;
        while(temp!=null && counter<=b){
            if(counter<a){
                start.next=temp;
                start=start.next;
            }
            if(counter>=a && counter<=b){
                arr.add(temp.data);
            }
            temp=temp.next;
            counter++;
        }
        counter+=arr.size();
        int index=arr.size()-1;
        for(int i=index;i>=0;i--){
            Node ab=new Node(arr.get(i));
            start.next=ab;
            start=start.next;
            
        }
        while(temp!=null){
            start.next=temp;
            start=start.next;
            temp=temp.next;
        }
        start.next=null;
        return dummy.next;
        
    }
}