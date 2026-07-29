class Solution {
    public String commonChars(String s1, String s2) {
        // code here
        String s3="";
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            set.add(s1.charAt(i));
        }
        HashSet<Character> set1=new HashSet<>();
        for(int i=0;i<s2.length();i++)
        {
            set1.add(s2.charAt(i));
        }
        List<Character> list=new ArrayList<>();
        for(char c:set1){
            if(set.contains(c)){
                list.add(c);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            s3+=list.get(i);
        }
        return s3;
    }
}