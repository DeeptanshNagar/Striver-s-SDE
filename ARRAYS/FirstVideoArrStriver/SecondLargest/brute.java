
import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 7};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }

    static int secondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int largest = arr[n-1];;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break; 
            }
        }

        return secondLargest;
    }
}
