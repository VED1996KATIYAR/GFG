class Solution {
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        subset(ans,s,"",0);
        Collections.sort(ans);
        return ans;
        
    }
    public static void subset(List<String> ans,String s,String path,int index){
        if(index==s.length()){
            ans.add(path);
            return;
        }
        subset(ans,s,path+s.charAt(index),index+1);
        subset(ans,s,path,index+1);
    }
}

