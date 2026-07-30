//package leetcode;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans=frequencySort(str);
        System.out.println(ans);
    }
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            int freqCompare = Integer.compare(map.get(a), map.get(b));
            
            // If frequencies are different, sort by frequency (ascending)
            if (freqCompare != 0) {
                return freqCompare;
            }
            // If frequencies match, sort alphabetically (lexicographical)
            return Character.compare(a, b);
        });
        StringBuilder sb = new StringBuilder();
        for(char ch:list){ 
            int r=map.get(ch);
            for (int i=1;i<=r;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}