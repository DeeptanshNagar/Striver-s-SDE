public class main {
	public static void main(String[] args) {
		System.out.println(nthFibo(4)); // Fibo :- 0, 1, 1, 2, 3, 5, 8, 13, 21
	}

	static int nthFibo(int n) {
		if(n <= 1) {
			return n;
		}

		int first = nthFibo(n - 1); // f(3)
		int second = nthFibo(n - 2); // f(2)

		return first + second; // 3
	}
}
