import java.util.Arrays;


public class brute2 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index position 
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            // if you didnt swap for a particular value of i, it means the array is sorted hence break
            if (!swapped) {
                break;
            }
        }
    }
}
