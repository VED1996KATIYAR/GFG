/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
        invert(root.left);
        return isidentical(root.left,root.right);
    }
    public static boolean isidentical(Node a1,Node a2){
        if(a1==null && a2==null) return true;
        if(a1==null || a2==null) return false;
        if(a1.data !=a2.data) return false;
        
        return isidentical(a1.left,a2.left) && isidentical(a1.right,a2.right);
    }
    public static void invert(Node r1){
        if(r1==null) return;
        Node temp=r1.left;
        r1.left=r1.right;
        r1.right=temp;
        invert(r1.right);
        invert(r1.left);
    }
}