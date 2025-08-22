import java.util.Arrays;

public class Optimized {
    public static void main(String[] args) {
        int[][] matrix = {{1,   2,   3,   4},
                          {5,   6,   7,   8},
                          {9,  10,  11,  12},
                          {13, 14,  15,  16}
        };
        int[][] result = rotateMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]) + " ");
        }
    }
    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
    }
}

// tc - O(n²)
// sc - O(n * n/2)