public class leetcodeDaily {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int ans = maxAdjacentDistance(nums);
        System.out.println(ans);
    }
    public static int maxAdjacentDistance(int[] nums) {
        int n = nums.length;

        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(nums[i]-nums[(i+1)%n]));
        }
        return maxDiff;
    }
}
