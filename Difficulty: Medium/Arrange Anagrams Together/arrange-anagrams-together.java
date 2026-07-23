class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        int n=arr.length;
        ArrayList<ArrayList<String>> arr1=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch[]= arr[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(map.containsKey(s)){
                map.get(s).add(arr[i]);
            }else{
                ArrayList<String> list=new ArrayList<>();
                list.add(arr[i]);
                map.put(s,list);
            }
        }
        arr1.addAll(map.values());
        return arr1;
    }
}