import java.util.HashMap;
public class LongestSubArrBetter {
    // CODE WORKS FOR ZEROS, POSITIVES AND NEGATIVES.
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        // int[] arr = {2, 0, 0, 3};
        int[] arr = {2, 0, 0, -1, 2, 1, 1, 3};
        int k = 3;
        int ans = longestSubarr(arr, k);
        System.out.println(ans);
    }
    static int longestSubarr(int[] arr, int k) {
        int maxLen = 0;
        long sum = 0;
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long remaining = sum - k;
            if(preSumMap.containsKey(remaining)) {
                int len = i - preSumMap.get(remaining);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}

// tc = o(n x log N)
// SC = O(n)