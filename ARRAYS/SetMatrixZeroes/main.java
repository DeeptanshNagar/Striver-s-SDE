public class main {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 1}
        };
        int n = nums.length;
        int m = nums[0].length;
        int[][] result = setZeros(nums, n, m);
        for(int[] arr : result) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // Marking rows and columns
    static int[][] setZeros(int[][] nums, int n, int m) {
        int col0 = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i][0] == 0) {
                col0 = 0;
            }                                                     // 0         = col0
            for (int j = 1; j < nums.length; j++) {               // 1 0 0 1 
                if(nums[i][j] == 0) {                             // 0 0 1 1
                    nums[i][0] = 0;                               // 0 1 0 1
                    nums[0][j] = 0;                               // 0 1 1 1 
                }
            }
        }

        // using marks to mark zeros in the sub-matrix shown below 
        //                     0  1  1
        //                     1  0  1
        //                     1  1  1
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i][0] == 0 || nums[0][j] == 0)  {
                    nums[i][j] = 0;
                }
            }
        }

        if(nums[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                nums[0][j] = 0;
            }
        }
        if(col0 == 0) {
            for (int i = 0; i < n; i++) {
                nums[i][0] = 0;
            }
        }
        return nums;

    }
}