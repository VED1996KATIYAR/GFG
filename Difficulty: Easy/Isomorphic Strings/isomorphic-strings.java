class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char ch1=s2.charAt(i);
            if(arr1[ch]!=arr2[ch1]){
                return false;
            }
            arr1[ch]=i+1;
            arr2[ch1]=i+1;
        }
        return true;
    }
}