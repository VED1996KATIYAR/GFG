import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // Digits 0 se 9 tak ka direct mapping array
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> ans = new ArrayList<>();

        // Edge Case: Agar array khali hai
        if (arr == null || arr.length == 0) {
            return ans;
        }

        // Backtracking function call
        combination(0, arr, new StringBuilder(), ans);

        // Driver code ke mutabik sorted order mein return karna hai
        Collections.sort(ans);
        return ans;
    }

    private static void combination(int index, int[] arr, StringBuilder current, ArrayList<String> ans) {
        // Base case: Jab saare digits process ho jayein
        if (index == arr.length) {
            if (current.length() > 0) { // Khali string add na ho
                ans.add(current.toString());
            }
            return;
        }

        int currentDigit = arr[index];

        // Agar digit 0 ya 1 hai, toh use skip karke seedhe agle digit par jao
        if (currentDigit == 0 || currentDigit == 1) {
            combination(index + 1, arr, current, ans);
            return;
        }

        String letters = KEYPAD[currentDigit];

        // Har letter ko try karo
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));          // Choose
            combination(index + 1, arr, current, ans);   // Explore (Next digit)
            current.deleteCharAt(current.length() - 1);  // Backtrack (Undo)
        }
    }
}
