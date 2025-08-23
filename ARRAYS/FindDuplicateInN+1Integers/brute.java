public class brute {
    public static void main(String args[]) {
        int[] arr = {1, 3, 4, 2, 6, 7, 8, 9, 2};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];   // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }
}