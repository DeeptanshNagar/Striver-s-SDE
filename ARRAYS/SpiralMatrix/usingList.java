import java.util.ArrayList;
import java.util.List;

public class usingList {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };
        List<Integer> result = spiralMatrix(matrix);
        System.out.println(result);
    }

    static List<Integer> spiralMatrix(int[][] matrix) {
        int n = matrix.length;        // rows
        int m = matrix[0].length;     // cols
        List<Integer> ans = new ArrayList<>();

        int srow = 0, erow = n - 1, scol = 0, ecol = m - 1;

        while (srow <= erow && scol <= ecol) {
            // Top row
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }

            // Right column
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            // Bottom row
            if (srow != erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
            }

            // Left column
            if (scol != ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    ans.add(matrix[i][scol]);
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
