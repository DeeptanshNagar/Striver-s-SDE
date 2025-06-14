public class optimized {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    static int getLongestSubarray(int[] arr , int k) {
        int n = arr.length;
        int maxlen = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while(right<n){
            if(sum>k) {
                sum = sum - left;
                left++;
            }
            if(sum==k){
                maxlen = Math.max(maxlen, right-left+1);
            }
            right++;
            if(right<n) {
                sum = sum + arr[right];
            }
        }
        return maxlen;
    }
}
