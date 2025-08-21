public class brute {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = rotateMatrix(matrix, n, m);

        for(int[] arr : result) {
            for(Integer i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static int[][] rotateMatrix(int[][] matrix, int n, int m) {
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        


        // for solving leetcode question you also have to place back elements from ans 2d array to matrix 2d array
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
        return matrix;
    }
}

// tc = o(n^2)
// sc = o(n^2)
