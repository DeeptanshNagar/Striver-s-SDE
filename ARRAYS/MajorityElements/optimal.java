// Moore's Voting Algorithm.


public class optimal {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0; // 1
        int element = 0;  // 2
        for (int i = 0; i < nums.length; i++) {
            if(count == 0) {
                count = 1;
                element = nums[i];
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        
        }
        int count1 = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == element) {
                count1++;
            }
        }
        if(count1 > n/2) {
            return element;
        }
        return -1;
    }
}
