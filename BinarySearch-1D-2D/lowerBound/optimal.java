public class optimal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
        int n = nums.length;
        int target = 9;
        int index = lowBound(nums, target, n);
        System.out.println(index);
    }
    static int lowBound(int[] nums, int target, int size) {
        int ans = size;
        int start = 0;
        int end = size - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}