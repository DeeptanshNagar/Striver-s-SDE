public class better {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,2};
        int ans = singleNum(arr);
        System.out.println(ans);
    }
    public static int singleNum(int[] arr) {
        int n = arr.length;
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int[] hash = new int[maxi+1];
        for (int i = 0; i < n; i++) {   // iterating arr
            hash[arr[i]]++;
        }
        for (int i = 0; i <= maxi; i++) {       // iterating hash array
            if(hash[i] == 1) {
                return i;
            }
        }
        return -1;
    }




    // leetcode wise 
    // public int singleNumber(int[] nums) {
    //     int n = nums.length;
    //     int maxi = nums[0];
    //     for (int i = 0; i < n; i++) {
    //         maxi = Math.max(maxi, nums[i]);
    //     }
    //     int[] hash = new int[maxi+1];
    //     for (int i = 0; i < n; i++) {   // iterating arr
    //         hash[nums[i]]++;
    //     }
    //     for (int i = 0; i <= maxi; i++) {       // iterating hash array
    //         if(hash[i] == 1) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}
