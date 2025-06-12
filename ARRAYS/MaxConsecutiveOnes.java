public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1,0,1,1};
        int ans = maxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    static int maxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }
}
