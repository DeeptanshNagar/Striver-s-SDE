import java.util.Arrays;

public class optimal {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,0,0,0};
        int[] arr2 = {1,2,3};
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = mergeSortedArr(arr1, arr2, n, m);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSortedArr(int[] arr1, int[] arr2, int n, int m) {
        int i = n - m - 1; // last element of the initial arr1 (excluding zeros)
        int j = m - 1;     // last element of arr2
        int idx = n - 1;   // last index of arr1

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[idx] = arr1[i];
                i--;
            } else {
                arr1[idx] = arr2[j];
                j--;
            }
            idx--;
        }
        while (j >= 0) {
            arr1[idx] = arr2[j];
            idx--;
            j--;
        }
        return arr1;
    }
}
