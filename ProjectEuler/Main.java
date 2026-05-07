import java.util.*;

class Solution {

    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public int[] searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {

            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {

                int colIndex = binarySearch(matrix[i], target);

                if (colIndex != -1) {
                    return new int[]{i, colIndex};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int target = 8;

        Solution obj = new Solution();

        int[] ans = obj.searchMatrix(matrix, target);

        System.out.println(Arrays.toString(ans));
    }
}