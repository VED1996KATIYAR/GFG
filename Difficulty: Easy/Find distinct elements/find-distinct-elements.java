class Solution {
    static int distinct(int arr[], int n) {
        // code here
        HashSet<Integer> arr1=new HashSet<>();
        for(int a:arr){
            if(!arr1.contains(a)){
                arr1.add(a);
            }
        }
        return arr1.size();
    }
}