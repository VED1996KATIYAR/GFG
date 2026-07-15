class Solution {
    public static int gcd(int a, int b) {
        // code here
        int cd=hcf(a,b);
        return cd;
    }
    public static int hcf(int a,int b){
        if(a==0|| b==0){
            return Math.max(a,b);
        }
        return hcf(b,a%b);
    }
}
