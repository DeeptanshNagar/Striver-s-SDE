import java.util.Arrays;

public class optimized {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        boolean ans = twoSum(nums, target);
        System.out.println(ans);
    }

    static boolean twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length-1];
        while(start < end) {
            int sum = start + end;
            if(sum == target) {
                return true;
            } else if(target > sum) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}