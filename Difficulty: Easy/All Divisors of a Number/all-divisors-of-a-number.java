import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>(getDivisors(n));
        System.out.println(list);
    }
    public static ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0){
                if(i*i==n){
                    list.add(i);
                }else{
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;

    }
}