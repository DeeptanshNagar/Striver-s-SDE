public class functionalway {
	public static void main(String[] args) {
		System.out.println(sumOfN(10));
	}

	static int sumOfN(int n) {
		if(n == 0) {
			return 0;
		}

		return n + sumOfN(n - 1);
	}
}