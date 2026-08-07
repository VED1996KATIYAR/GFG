import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(countFreq(arr));
        System.out.println(list);
    }
    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int b:map.keySet()){
            int c=b;
            int f=map.get(b);
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(c);
            temp.add(f);
            list.add(new ArrayList<>(temp));
        }
        return list;
    }
}