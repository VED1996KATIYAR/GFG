class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> arr=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                arr.push(ch);
            }else {
                if(arr.size()==0){
                    return false;
                }else{
                    char ch1=arr.peek();
                    if((ch1=='{' && ch=='}') || (ch1=='[' && ch==']') || (ch1=='(' && ch==')')){
                        arr.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return arr.size()==0;
    }
}
