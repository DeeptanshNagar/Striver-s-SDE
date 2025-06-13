import java.util.ArrayList;
import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] ans = sortColors(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sortColors(int[] nums){
        int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                temp.add(nums[i]);
            }
        }

        int size = temp.size();
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                temp2.add(nums[i]);
            }
        }

        int size2 = temp2.size();

        // Fill 0s
        for (int i = 0; i < size; i++) {
            nums[i] = temp.get(i);
        }

        // Fill 1s
        for (int i = 0; i < size2; i++) {
            nums[size + i] = temp2.get(i);
        }

        // Fill remaining with 2s
        for (int i = size + size2; i < n; i++) {
            nums[i] = 2;
        }

        return nums;
    }
}
