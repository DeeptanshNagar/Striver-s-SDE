public class setMatBetter {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5},
        };
        int n = matrix.length; // 3
        int m = matrix[0].length; // 4
        int[][] ans = setZerosBetterly(matrix, n, m);
        for(int[] arr : ans) {
            for(int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    static int[][] setZerosBetterly(int[][] matrix, int n, int m) {
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
