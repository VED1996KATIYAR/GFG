import java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     String s = scan.nextLine();
    //     ArrayList<String> arr = new ArrayList<>(permutation(s));
    //     Collections.sort(arr);
    //     System.out.println(arr);
    // }
    public static ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        findpermutation(ch,0,res);
        Collections.sort(res);
        return res;
    }
    public static void findpermutation(char []ch,int start,ArrayList<String> res){
        if(start==ch.length){
            StringBuilder sb=new StringBuilder();
            for(char c:ch){
                sb.append(c);
            }
            res.add(sb.toString());
            return;
        }
        for(int i=start;i<ch.length;i++){
            char temp=ch[i];
            ch[i]=ch[start];
            ch[start]=temp;
            findpermutation(ch,start+1,res);
            temp=ch[i];
            ch[i]=ch[start];
            ch[start]=temp;
        }
    }
}