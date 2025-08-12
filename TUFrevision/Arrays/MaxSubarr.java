// BruteForce solution with time complexity order of N square.

// public class MaxSubarr {
//     public static void main(String[] args) {
//         int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
//         int ans = maxiSubarray(arr);
//         System.out.println(ans);
//     }

//     static int maxiSubarray(int[] arr) {
//         int maxi = 0;
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