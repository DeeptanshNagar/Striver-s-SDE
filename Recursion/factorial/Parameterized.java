public class parameterized {
    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
    }

    static int factorial(int n, int fact) {
        if (n == 0) {
            return fact;
        }

        return factorial(n - 1, fact * n);
    }
}