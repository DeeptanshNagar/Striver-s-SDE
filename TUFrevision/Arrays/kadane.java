public class kadane {
    public static void main(String[] args) {
        int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = maxiSubarray(arr);
        System.out.println(ans);
    }
    static int maxiSubarray(int[] arr) {
        int maxi = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}