class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        for(int i=0;i<txt.length();i++){
            for(int j=i;j<txt.length();j++){
                String s=txt.substring(i,j+1);
                if(s.equals(pat)){
                    return i;
                }
            }
        }
        return -1;
    }
}