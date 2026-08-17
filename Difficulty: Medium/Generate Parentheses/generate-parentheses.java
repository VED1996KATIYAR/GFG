// import java.util.*;
// public class Solution {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         List<String> arr = new ArrayList<>(generateParentheses(n));

//         System.out.println(arr);
//     }
//     public static ArrayList<String> generateParentheses(int n) {
        
//             // code here
//         ArrayList<String> arr = new ArrayList<>();
//         if(n%2==0){
//             return arr;
//         }
//         generate("",0,0,n,arr);
//         return arr;
//     }
//     public static void generate(String s,int left,int right,int n,ArrayList<String> arr){
//         if(s.length()==n){
//             arr.add(s);
//             return;
//         }
//         if(left<n/2){
//             generate(s+"(",left+1,right,n,arr);
//         }
//         if(right<left){
//             generate(s+")",left,right+1,n,arr);
//         }
//     }




// }
class Solution {
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> arr = new ArrayList<>();
        // Agar n odd (vishyam) hai, toh balanced brackets banana namumkin hai
        if (n % 2 != 0) {
            return arr; 
        }
        generate("", 0, 0, n, arr);
        return arr;
    }

    public void generate(String s, int left, int right, int n, ArrayList<String> arr) {
        // Base case: Jab string ki lambai n ke barabar ho jaye
        if (s.length() == n) {
            arr.add(s);
            return;
        }

        // Opening brackets ki maximum ginti n / 2 ho sakti hai
        if (left < n / 2) {
            generate(s + "(", left + 1, right, n, arr);
        }

        // Closing bracket tabhi aayega jab woh kisi opening bracket ko balance kar sake
        if (right < left) {
            generate(s + ")", left, right + 1, n, arr);
        }
    }
}
