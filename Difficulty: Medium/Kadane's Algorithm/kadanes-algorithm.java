class Solution {
    int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int currMax = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            
            currMax = Math.max(arr[i], currMax + arr[i]);
            
            
            res = Math.max(res, currMax);
        }
        
        return res;
    }
}
