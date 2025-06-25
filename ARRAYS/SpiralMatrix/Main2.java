import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[] result = spiralMatrix(matrix);
        System.out.println(Arrays.toString(result));
    }

    static int[] spiralMatrix(int[][] matrix) {
        int n = matrix.length;        // row
        int m = matrix[0].length;     // cols
        int[] ans = new int[n * m];
        int index = 0;

        int srow = 0, erow = n - 1, scol = 0, ecol = m - 1;

        while (srow <= erow && scol <= ecol) {
            // Top row
            for (int j = scol; j <= ecol; j++) {
                ans[index++] = matrix[srow][j];
            }

            // Right column
            for (int i = srow + 1; i <= erow; i++) {
                ans[index++] = matrix[i][ecol];
            }

            // Bottom row
            if (srow != erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    ans[index++] = matrix[erow][j];
                }
            }

            // Left column
            if (scol != ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    ans[index++] = matrix[i][scol];
                }
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return ans;
    }
}
