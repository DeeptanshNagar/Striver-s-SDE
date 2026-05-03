import java.util.Scanner;

public class ques3 {

    static long lpf(long n) {
		long largest = 1;

		while (n % 2 == 0) {
			largest = 2;
			n /= 2;
		}

		for (long i = 3; i <= n / i; i += 2) {
			while (n % i == 0) {
				largest = i;
				n /= i;
			}
		}

		if (n > 1) largest = n;

		return largest;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(lpf(n));
        }
    }
}