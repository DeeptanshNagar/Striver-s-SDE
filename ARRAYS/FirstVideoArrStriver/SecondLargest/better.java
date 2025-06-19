public class better {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 7};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break; 
            }
        }

        return secondLargest;
    }
}

// Tc = O(2N)
// Sc = O(1)