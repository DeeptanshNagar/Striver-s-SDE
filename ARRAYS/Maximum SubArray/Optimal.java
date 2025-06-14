public class Optimal {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int[] arr = {-4,-3,-2,-7,-1};
        int result = maxSubArray(arr);
        System.out.println(result); 
    }

    static int maxSubArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }

            // for some questions only eitherwise ignore
            // if(maxi<0) {
            //     maxi = 0;
            // }
            
        }
        return maxi;
    }
}

// // Kadane's Algorithm

// public class better {
//     public static void main(String[] args) {
//         int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//         int result = maxSubArray(arr);
//         System.out.println(result);
//     }

//     static int maxSubArray(int[] arr) {
//         int maxi = Integer.MIN_VALUE;
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//             maxi = Math.max(maxi, sum);
//             if(sum<0) {
//                 maxi = 0;
//                 sum = 0;
//             } else {
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return -1;
//     }
// }