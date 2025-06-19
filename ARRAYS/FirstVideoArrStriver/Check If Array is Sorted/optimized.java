public class optimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean ans = checkSorted(arr);
        System.out.println(ans);
    }

    static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
