//package DAY2;
//import java.util.*;
//public class Solution {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int target=in.nextInt();
//
//        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//        combination(0,target,arr,new ArrayList<>(),list);
//        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
//        combination1(0,target,arr,new ArrayList<>(),list1);
//        System.out.println(list);
//        System.out.println(list1);
//    }
//    public static void combination(int index,int target,int arr[],ArrayList<Integer> result,ArrayList<ArrayList<Integer>> list){
//        if(target==0){
//            list.add(new ArrayList<>(result));
//            return;
//        }
//        if(index==arr.length||target<0){
//            return;
//        }
//        //pick
//        result.add(arr[index]);
//        combination(index,target-arr[index],arr,result,list);
//        result.remove(result.size()-1);
//        //skip
//        combination(index+1,target,arr,result,list);
//
//    }
//    public static void combination1(int index,int target,int[] arr,ArrayList<Integer> result,ArrayList<ArrayList<Integer>> list){
//        if(target==0){
//            list.add(new ArrayList<>(result));
//            return;
//        }
//        if (index==arr.length||target<0){
//            return;
//        }
//        //pick
//        result.add(arr[index]);
//        combination(index+1,target-arr[index],arr,result,list);
//        result.remove(result.size()-1);
//        //skip
//        combination(index+1,target,arr,result,list);
//    }
//}



import java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=in.nextInt();
    //     }
    //     int target=in.nextInt();
    //     HashSet<List<Integer>> set=new HashSet<>();
    //     List<Integer> list=new ArrayList<>();
        
    // }
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        HashSet<List<Integer>> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        findcomb(0,target,arr,list,set);
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(List<Integer> list1:set){
            result.add(new ArrayList<>(list1));
        }
        return result;

    }
    public static void findcomb(int index,int target,int[] arr,List<Integer> list,HashSet<List<Integer>> set){
        if (target==0){
            set.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || index>=arr.length){
            return;
        }
        //pick
        list.add(arr[index]);
        findcomb(index+1,target-arr[index],arr,list,set);
        list.remove(list.size()-1);
        findcomb(index+1,target,arr,list,set);
    }
}