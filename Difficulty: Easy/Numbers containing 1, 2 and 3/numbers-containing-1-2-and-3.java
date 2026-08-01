//import java.util.*;
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        boolean a=areNumbersAscending(s);
//        System.out.println(a);
//    }
//    public static boolean areNumbersAscending(String s) {
//        ArrayList<Integer> list = new ArrayList<>();
//        String [] ss=s.split(" ");
//        for(String str:ss){
//            if(Character.isDigit(str.charAt(0))){
//                int l=Integer.parseInt(str);
//                list.add(l);
//            }
//        }
//        for(int i=1;i<list.size();i++){
//            if(list.get(i-1)>list.get(i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arr1=new ArrayList<>(filterByDigits(arr));
        System.out.println(arr1);

    }
    public static ArrayList<Integer> filterByDigits(int[] arr) {
        // code here

        ArrayList<Integer> arr1=new ArrayList<>();
        for(int a:arr){
            String a1=String.valueOf(a);

            boolean check=true;
            for(int i=0;i<a1.length();i++){
                char ch=a1.charAt(i);
                if(!(ch=='1'||ch=='2'||ch=='3')){
                    check=false;
                    break;
                }
            }
            if(check){
                arr1.add(a);
            }
        }
        if(arr1.size()==0){
            arr1.add(-1);
        }
        return arr1;


    }
}
