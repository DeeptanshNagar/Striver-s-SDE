import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7, 9};
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left + 1, right - 1);
    }
}

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {4, 2, 3, 1, 7, 9};
//         reverseArray(arr, 0);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void reverseArray(int[] arr, int i) {
//         if (i >= arr.length / 2) {
//             return;
//         }

//         int temp = arr[i];
//         arr[i] = arr[arr.length - 1 - i];
//         arr[arr.length - 1 - i] = temp;

//         reverseArray(arr, i + 1);
//     }
// }