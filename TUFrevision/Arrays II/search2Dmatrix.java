public class search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 4, 7, 9},
            {12, 13, 16, 18},
            {20, 21, 23, 29},
            {32, 35, 47, 52}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int target = 23;
        boolean result = searchMatrix(matrix, n, m, target);
        System.out.println(result);
    }

    static boolean searchMatrix(int[][] matrix, int n, int m, int target) {
        for (int row = 0; row < n; row++) {
            if(matrix[row][0] <= target && target <= matrix[row][m - 1]) {
                return binarySearch(matrix[row], target);
            }
        }
        return false;
    }
    static boolean binarySearch(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > row[mid]) {
                start = mid + 1;
            } else if (target < row[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
