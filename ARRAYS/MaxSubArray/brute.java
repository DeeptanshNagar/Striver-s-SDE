public class brute {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    static int getLongestSubarray(int[] arr, long k) {
        int n = arr.length;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }
}
