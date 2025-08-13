public class kadaneModified {
    public static void main(String[] args) {
        int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = maxiSubarray(arr);
        System.out.println(ans);
    }
    static int maxiSubarray(int[] arr) {
        int maxi = arr[0];
        int sum = 0;
        int ansStart = 0;
        int ansEnd = 0;
        int Start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) {
                Start = i;
            }
            sum += arr[i];
            if(sum > maxi) {
                maxi = sum;
                ansStart = Start;
                ansEnd = i;
            }
            if(sum < 0) {
                sum = 0;
            }
            if(maxi < 0) {
                maxi = 0;
            }
        }
        System.out.print("[ ");
        for (int j = ansStart; j <= ansEnd; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("]");
        return maxi;
    }
}
