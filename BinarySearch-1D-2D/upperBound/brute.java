public class brute {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
        int target = 1;
        int ans = lowerBound(nums, target);
        System.out.println(ans);
    }
    static int lowerBound(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
