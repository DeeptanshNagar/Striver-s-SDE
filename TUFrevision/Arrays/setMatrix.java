public class setMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5},
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = setZeros(matrix, row, col);
        for(int[] arr : ans) {
            for(int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    static int[][] setZeros(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0){
                    markRow(matrix, row, col, i);
                    markCol(matrix, row, col, j);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    static void markRow(int[][] matrix, int row, int col, int i) {
        for (int j = 0; j < col; j++) {
            if(matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    static void markCol(int[][] matrix, int row, int col, int j) {
        for (int i = 0; i < row; i++) {
            if(matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }
}
