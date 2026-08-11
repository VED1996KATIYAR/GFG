import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k=scan.nextInt();
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>(combinationSum(n,k));
        System.out.println(lists);
    }
    public static ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        combination(1,n,k,list,lists);
        return lists;

    }
    public static void combination(int index,int n,int k,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> lists){
        if(n==0 && k==0){
            lists.add(new ArrayList<>(list));
            return;
        }
        if(n<0 || k<0 || index>9){
            return;
        }
        list.add(index);
        combination(index+1,n-index,k-1,list,lists);
        list.remove(list.size()-1);
        combination(index+1,n,k,list,lists);
    }
}