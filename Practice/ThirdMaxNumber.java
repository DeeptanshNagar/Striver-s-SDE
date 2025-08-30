public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        int ans = thirdmaxy(arr, n);
        System.out.println(ans);
    }

    static int thirdmaxy(int[] arr, int n) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(largest == arr[i] || secondLargest == arr[i] || thirdLargest == arr[i]) {
                continue;
            }
            if(arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if(arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }
        if(thirdLargest == Long.MIN_VALUE) {
            return (int)largest;
        } else {
            return (int)thirdLargest;
        }
    }
}
