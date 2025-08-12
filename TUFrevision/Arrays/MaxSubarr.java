// Optimized solution with time complexity order of N square (KADANE'S ALGORITHM)

public class MaxSubarr{
    public static void main(String[] args) {
        int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = maxiSubarray(arr);
        System.out.println(ans);
    }

    static int maxiSubarray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0; 
        int ansStart = 0;
        int ansEnd = 0;
        int Start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0){
                Start = i;
            }
            sum = sum + arr[i];
            if(sum > maxi) {
                maxi = sum;
                ansStart = Start;
                ansEnd = i;    
            }

            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.print("[ ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        return maxi;
    }
}



// BruteForce solution with time complexity order of N square.

// public class MaxSubarr {
//     public static void main(String[] args) {
//         int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
//         int ans = maxiSubarray(arr);
//         System.out.println(ans);
//     }

//     static int maxiSubarray(int[] arr) {
//         int maxi = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum = sum + arr[j];
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }



// Extreme BruteForce solution with time complexity order of N cube.

// public class MaxSubarr {
//     public static void main(String[] args) {
//         int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
//         int ans = maxiSubarray(arr);
//         System.out.println(ans);
//     }

//     public static int maxiSubarray(int[] arr) {
//         int maxi = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum = sum + arr[k];
//                 }
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }