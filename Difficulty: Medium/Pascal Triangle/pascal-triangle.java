import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(nthRowOfPascalTriangle(n));
        System.out.println(list);
    }
    public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        int dp[][]=new int[n][];
        int index=0;
        for(int i=1;i<=n;i++){
            dp[index++]=new int[i];
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            //ArrayList<Integer> temp=new ArrayList<>();
            if(i==0){
                dp[0][0]=1;
            }else{
              dp[i][0]=1;
              int l=dp[i].length-1;
              dp[i][l]=1;
              for(int j=1;j<l;j++){
                  dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
              }
            }
        }
        for(int i=0;i<dp.length;i++){
            ArrayList<Integer> list1=new ArrayList<>();
            for(int j=0;j<dp[i].length;j++){
                list1.add(dp[i][j]);
            }
            list.add(list1);
        }
        return list.get(n-1);
    }
}