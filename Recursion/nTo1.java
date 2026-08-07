// By BackTracking

public class nTo1 {
	public static void main(String[] args) {
		n21(1, 3);
	}
	static void n21(int i, int N) {
		if(i > N){
			return;
		}

		n21(i + 1, N);	
		System.out.println(i);
	}
}
