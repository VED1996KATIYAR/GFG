/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static ArrayList<Integer> arr;
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        arr=new ArrayList<>();
        helper(root,arr);
        return arr;
        
    }
    public static void helper(Node root,ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        arr.add(root.data);
        helper(root.left,arr);
        helper(root.right,arr);
    }
}