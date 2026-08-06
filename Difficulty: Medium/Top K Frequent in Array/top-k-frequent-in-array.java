//import java.util.ArrayList;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        ArrayList<Integer> list=new ArrayList<>(topKFreq(nums,k));
    }
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            return map.get(b)-map.get(a);
        });
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<k;i++){
            list1.add(list.get(i));
        }
        return list1;
    }
}
