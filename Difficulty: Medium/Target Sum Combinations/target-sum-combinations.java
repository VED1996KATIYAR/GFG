import  java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int target=input.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(targetSumComb(arr,target));
        System.out.println(list);
    }
    public static ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        getthelist(0,arr,target,new ArrayList<>(),list);
        return list;

    }
    public static void getthelist(int index,int []arr,int target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(index==arr.length||target<0){
            return;
        }
        list.add(arr[index]);
        getthelist(index,arr,target-arr[index],list,result);
        list.remove(list.size()-1);
        getthelist(index+1,arr,target,list,result);
    }
}