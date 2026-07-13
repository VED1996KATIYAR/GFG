class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> arr1=new HashSet<>();
        for(int aa:a){
            arr1.add(aa);
        }
        for(int bb:b){
            arr1.add(bb);
        }
        for(int c:arr1){
            arr.add(c);
        }
        return arr;
    }
}