import java.util.HashMap;

class Solution {
    public static int longestUniqueSubstr(String s) {
        // Edge case: agar string khali hai
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0; // Window ka starting pointer

        // right pointer se poori string ko traverse karenge
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Agar character pehle aa chuka hai aur uski position current window ke andar hai
            if (map.containsKey(currentChar)) {
                // Left pointer ko duplicate character ke agle index par shift karenge
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Character ki latest position map me update karenge
            map.put(currentChar, right);

            // Window ki current length nikal kar max length ko update karenge
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
