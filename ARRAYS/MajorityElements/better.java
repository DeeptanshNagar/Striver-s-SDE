import java.util.HashMap;

public class better {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = findMajority(nums);
        System.out.println(result);
    }

    static int findMajority(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int halfLength = nums.length / 2;
        
        // Count each number and check immediately
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > halfLength) {
                return num;
            }
        }
        
        return -1; 
    }
}