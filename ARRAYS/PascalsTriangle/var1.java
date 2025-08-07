public class var1 {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        int element = pascaltriangle(row, col);
        System.out.println(element);
    }

    static int pascaltriangle(int row, int col) {
        int element = (int) ncr(row - 1, col - 1);
        return element;
    }

    static long ncr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
