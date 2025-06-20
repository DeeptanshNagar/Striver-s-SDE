public class brute {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        int ans = findLongestSeq(arr);
        System.out.println(ans);
    }

    static int findLongestSeq(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x+1) == true) {  // x+1 is our target
                x = x+1;
                count = count + 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    

    static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
    
        return false;
    }
    
}
// tc = o(n*n)
// sc = o(1)