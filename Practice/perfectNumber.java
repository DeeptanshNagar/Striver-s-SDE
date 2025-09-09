public class perfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(1));
        System.out.println(checkPerfectNumber(28));
    }
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                // System.out.println("Factor: " + i);
            }
        }
        // System.out.println("Sum of factors = " + sum);
        return sum == num;
    }
}
