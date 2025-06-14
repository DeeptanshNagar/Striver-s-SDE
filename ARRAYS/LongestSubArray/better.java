import java.util.HashMap;

public class better {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};                                // this is applicable for ZEROS and NEGATIVES.
        int k = 3;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    static int getLongestSubarray(int[] arr, int k) {
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        int maxlen = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxlen = Math.max(maxlen, i+1);
            }
            long remaining = sum - k;

            if(preSumMap.containsKey(remaining)){
                int len = i - preSumMap.get(remaining);
                maxlen = Math.max(maxlen, len);
            }
            if(!preSumMap.containsKey(sum)){                 // because of this condition.
                preSumMap.put(sum, i);
            }
        }
        return maxlen;
    }
}