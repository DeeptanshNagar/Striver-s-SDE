public class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16}
        };

        int[] ans = printSpiral(mat);

        for (int val : ans) {
            System.out.print(val + " ");
        }

        System.out.println();
    }
    public static int[] printSpiral(int[][] mat) {
        int n = mat.length;        // number of rows
        int m = mat[0].length;     // number of columns

        int[] ans = new int[n * m];
        int index = 0;

        int srow = 0, scol = 0, ecol = n - 1, erow = m - 1;

        while (srow <= erow && scol <= ecol) {

            // Top
            for (int j = scol; j <= ecol; j++) {
                ans[index++] = mat[srow][j];
            }

            // Right
            for (int i = srow + 1; i <= erow; i++) {
                ans[index++] = mat[i][ecol];
            }

            // Bottom
            for (int j = ecol - 1; j >= scol; j--) {
                if(srow == erow) {
                    break;
                }
                ans[index++] = mat[erow][j];
            }

            // Left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if(scol == ecol) {
                    break;
                }
                ans[index++] = mat[i][scol];
            }
            srow++; ecol--; erow--; scol++;
            
        }

        return ans;
    }
}
