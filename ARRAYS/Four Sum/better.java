import java.util.*;

class better {
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
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long fourth = (long) target - sum;

                    if (hashset.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        temp.sort(null);
                        st.add(temp);
                    }

                    hashset.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}
