import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class optimal {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};

        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);

        for (List<Integer> quad : result) {
            System.out.print("[ ");
            for (int num : quad) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < nums.length; j++) {
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int m = n-1;
                while(k < m) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];
                    if(sum < target) {
                        k++;
                    } else if (sum > target ) {
                        m--;
                    } else {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[m]);
                        ans.add(temp);

                        k++;
                        m--;
                        while(k < m && nums[k] == nums[k-1]) k++;
                        while(k < m && nums[m] == nums[m+1]) m--;
                    }
                }
            }
        }
        return ans;
    }
}
