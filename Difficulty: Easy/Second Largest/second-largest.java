class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        HashSet<Integer> a=new HashSet<>();
        for(int c:arr){
            a.add(c);
        }
        ArrayList<Integer> arrr=new ArrayList<>();
        for(int d:a){
            arrr.add(d);
        }
        Collections.sort(arrr);
        return arrr.size()==1?-1:arrr.get(arrr.size()-1-1);
    }
}