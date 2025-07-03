import java.util.HashMap;

public class optimal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int ans = countSubarray(nums, k);
        System.out.println(ans);
    }

    static int countSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1);  // base case: prefix sum 0 has one count
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            // Check if there is a prefix sum that when removed gives sum = k
            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k);
            }

            int freq = prefixSumFreq.getOrDefault(sum, 0);
            prefixSumFreq.put(sum, freq + 1);

        }

        return count;
    }
}
