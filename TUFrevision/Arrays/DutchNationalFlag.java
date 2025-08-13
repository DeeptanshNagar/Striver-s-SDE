// Popular Algo - National Dutch Flag Algo.

// [0 to low - 1]-------> 0     {extreme left}
// [low to mid - 1] -------> 1   {. .}
// [high + 1 to n - 1]-------> 2  {extreme right}

// 0 to low - 1 (0)
// low to mid - 1 (1)
// mid to high (randomly filled with 0s, 1s, 2s)
// high + 1 to n - 1 (2s)

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        flag(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void flag(int[] arr) {
        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(n > 0) {
            
        }
    }
}
