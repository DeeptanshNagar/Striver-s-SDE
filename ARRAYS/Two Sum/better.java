import java.util.Arrays;
import java.util.HashMap;

public class better {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            int more = target - start;
            if (result.containsKey(more)) {
                return new int[]{result.get(more), i};
            }
            result.put(nums[i], i);
        }
        return null;
    }
}
