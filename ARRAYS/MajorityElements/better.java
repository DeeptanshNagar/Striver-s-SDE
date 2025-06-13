import java.util.HashMap;
import java.util.Map;

public class better {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            if(it.getValue() > n/2) {
                return it.getKey();
            }
        }
        return -1;
    }
}

