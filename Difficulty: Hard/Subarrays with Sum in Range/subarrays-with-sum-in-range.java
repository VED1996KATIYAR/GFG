// class Solution {
//     public static int countSubarray(int[] arr, int l, int r) {
//         // code here
//         int count=0;
//         for (int i = 0; i<arr.length; i++){
//             for (int j = i; j<arr.length; j++){
//                 int sum=0;
//                 for (int k=i;k<=j;k++){
//                     sum+=arr[k];
//                 }
//                 if (sum>=l && sum<=r){
//                     count++;
//                 }
                
//             }
//         }
//         return count;

//     }
// }
class Solution{
public static int countSubarray(int[] arr, int l, int r) {
    // R se chote ya barabar sum wale subarrays - (L-1) se chote ya barabar sum wale subarrays
    return countSubarrayLessThanOrEqual(arr, r) - countSubarrayLessThanOrEqual(arr, l - 1);
}

private static int countSubarrayLessThanOrEqual(int[] arr, int target) {
    if (target < 0) return 0; // Agar array mein sirf positive numbers hain
    
    int count = 0;
    int currentSum = 0;
    int left = 0;
    
    // Sliding window technique
    for (int right = 0; right < arr.length; right++) {
        currentSum += arr[right];
        
        // Agar sum target se bada ho jaye, toh left pointer ko aage badhayein
        while (currentSum > target && left <= right) {
            currentSum -= arr[left];
            left++;
        }
        
        // Is window ke andar banne wale saare valid subarrays count karein
        count += (right - left + 1);
    }
    
    return count;
}}
