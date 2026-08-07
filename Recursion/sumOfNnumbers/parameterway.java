public class parameterway {
	public static void main(String[] args) {
		sumOfN(10, 0);
	}

	static void sumOfN(int n, int sum) {
		if(n < 1) {
			System.out.println(sum);
			return;
		}

		sumOfN(n - 1, sum + n);
	}
}
