// DAY 2 <-----/---> QUE 2

public class Ques2 {
    public static void main(String[] args) {
        int[] nums = {5, 9, 2};
        int[] result = firstLast(nums);
        System.out.println("First: " + result[0] + ", Last: " + result[1]);
    }

    static int[] firstLast(int[] nums) {
        int first = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                first = nums[i];
            } else if (i == nums.length - 1) {
                last = nums[i];
            }
        }
        return new int[]{first, last};
    }
}

// Time Comp. = O(N)
// Space Comp. = O(1)