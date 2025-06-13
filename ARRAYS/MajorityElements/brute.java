public class brute {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    static int majorityElement(int[] nums) {
        int n = nums.length;
        int c = n/2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if (count > c) {
                return nums[i];
            }
        }
        return -1;
    }
}