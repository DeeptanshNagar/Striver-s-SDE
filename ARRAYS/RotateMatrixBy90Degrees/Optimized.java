public class Optimized {
    public static void main(String[] args) {
        int[][] matrix = {{1,   2,   3,   4},
                          {5,   6,   7,   8},
                          {9,  10,  11,  12},
                          {13, 14,  15,  16}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = rotateMatrix(matrix);

        for(int[] arr : result) {
            for(Integer i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m/2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
    }
    // tc - O(n²)
    // sc - O(n * n/2)
}