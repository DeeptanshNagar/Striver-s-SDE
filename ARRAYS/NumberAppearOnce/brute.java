public class brute {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4};
        int ans = singleNum(nums);
        System.out.println(ans);
    }
    public static int singleNum(int[] nums) {
        for(int i = 0; i<nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for(int j=0; j < nums.length; j++){
                if(nums[j]==num) {
                    count++;
                }
            }
            if(count == 1) {
                return num;
            }
        }
        return -1;
    }
}
