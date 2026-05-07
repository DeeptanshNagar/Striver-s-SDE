import java.util.*;

public class kadane {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = maxiSubarray(arr);

        System.out.println(ans);
    }

    static int maxiSubarray(int[] arr) {

        int maxi = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
}