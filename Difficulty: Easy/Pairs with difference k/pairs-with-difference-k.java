import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int countPairs(int[] arr, int k) {
        // Elements ki frequency store karne ke liye map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Har unique element ke liye check karein
        for (int x : freq.keySet()) {
            // Agar (x + k) bhi array mein exist karta hai
            if (freq.containsKey(x + k)) {
                // Dono ki frequency ko multiply karke count mein add karein
                count += freq.get(x) * freq.get(x + k);
            }
        }

        return count;
    }
}
