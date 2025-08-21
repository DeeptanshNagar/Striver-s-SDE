
import java.util.Arrays;

public class brutepractice {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = rotateMat(matrix, n, m);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]) + " ");
        }
    }
    static int[][] rotateMat(int[][] matrix, int n, int m) {
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[j][n-1-i] = matrix[i][j];
            }
        }
        return temp;
    }
}
