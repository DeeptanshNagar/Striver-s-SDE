import java.util.Arrays;

public class brute {
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};

		moveZeros(arr);

		System.out.println(Arrays.toString(arr));
	}

	static int[] moveZeros(int[] arr) {
		int[] temp = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
		
        return arr;
	}
}
