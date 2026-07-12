class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> arr2=new ArrayList<>();
                        arr2.add(i);
                        arr2.add(j);
                        arr2.add(k);
                        arr1.add(arr2);
                    }
                }
                
            }
        }
        return arr1;
        
    }
}