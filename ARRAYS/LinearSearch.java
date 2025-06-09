public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 2, 3};
        int target = 2;
        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}