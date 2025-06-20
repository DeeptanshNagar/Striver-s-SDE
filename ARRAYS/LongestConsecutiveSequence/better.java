
import java.util.Arrays;



public class better {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1}; // [1, 1, 1, 2, 3, 4, 100, 101, 102]
        int ans = findLongestSeq(arr);
        System.out.println(ans);
    }
    static int findLongestSeq(int[] arr) {
        Arrays.sort(arr);
        int count = 0; // 1
        int prevSmall = Integer.MIN_VALUE; // 2
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - 1 == prevSmall) {
                count = count + 1;
                prevSmall = arr[i];
            } else if (arr[i] != prevSmall) {
                count = 1;
                prevSmall = arr[i];
            } 
            longest = Math.max(longest, count);
        }
        return longest;
    }
}