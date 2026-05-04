import java.util.Arrays;

public class OptimizedRotatedarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        rotateToRight(arr, n, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void Rotateeletoleft(int[] arr, int n, int k) {
        // Reverse first k elements
        Reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        Reverse(arr, k , n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

	public static void rotateToRight(int[] arr, int n, int k) {
        // Step 1: reverse entire array
        Reverse(arr, 0, n - 1);
		// Step 2: reverse first k elements
        Reverse(arr, 0 , k - 1);
        // Step 3: reverse remaining n-k elements
        Reverse(arr, k, n - 1);
    }
}
